/*
 4. Create a program to ask a user for their name and then append this to a log file (text file).
*/
#include <stdio.h>
#include <sys/types.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>
#include <sys/stat.h>
#include <string.h>
#include <time.h>
#define MAX 20

void sig_handler(int sigNum) {
	if (sigNum == SIGTERM) {
		printf("SIGINT Interrupt Received - File IO ain't working\n");
	}
}

int main(void) {
	pid_t pid;
	int ret;
	int ppid;
	char name[MAX];
	time_t now;

	int hours, minutes, seconds;
	int day, month, year;

	time(&now);

	struct tm * local = localtime(&now);

	hours = local -> tm_hour;
	minutes = local -> tm_min;
	seconds = local -> tm_sec;

	day = local -> tm_mday;
	month = local -> tm_mon + 1;
	year = local -> tm_year + 1900;

	if (signal(SIGTERM, sig_handler) == SIG_ERR) {
		printf("\nSomething went wrong!!\n");
	}
	else {
		printf("Child process is returned with: %d.\n", 0);
	}

	printf("Please type user name: ");
	fgets(name, MAX, stdin);
	name[(strlen(name)-1)] = 0;


	pid = fork();

	if (pid == 0) {
		FILE* pFile;
		char buffer[256];
		ppid = getpid();

		pFile = fopen("logfile.txt", "a+");

		if (pFile == NULL) {
			perror("Error opening file.");
			kill(ppid, SIGTERM);
		}
		else {
			char mode[] = "0777";
			char buf[100] = "logfile.txt";
			int i;

			i = strtol(mode, 0, 8);

			if (chmod(buf, i) < 0) {
				exit(1);
			}

			if (hours < 12) {
				fprintf(pFile, "%s %s (%02d:%02d:%02dAM - %02d/%02d/%d)\n",  "The program was executed by", name, hours, minutes, seconds, day, month, year);
			}
			else {
				fprintf(pFile, "%s %s (%02d:%02d:%02dPM - %02d/%02d/%d)\n",  "The program was executed by", name, hours - 12, minutes, seconds, day, month, year);		
			}
			
		}

		fclose(pFile);
	}
	else { // Parent
		// Parent logic here
	}

}
