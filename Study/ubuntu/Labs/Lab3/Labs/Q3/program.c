/*
    3. Create a program that manages the process of automatically creating a log file in a directory. This should be a separate process. If this process terminates unexpectedly the main program should be informed via an appropriate signal.
*/
#include <stdio.h>
#include <sys/types.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>

void sig_handler(int sigNum) {
	// printf("%d\n",sigNum);
    if (sigNum == SIGTERM) {
        printf("SIGINT Interrupt Received - File IO ain't working\n");
    }
}

int main (void) {
    pid_t pid;
    int ret;
    int ppid;

    // Register signal handler through the signal() function
    if (signal(SIGTERM, sig_handler) == SIG_ERR) {
        printf("\nSomething went wrong!!\n");
    }
    else {
        printf("Child process is returned with: %d.\n", 0);
    }

    pid = fork();

    if (pid == 0) { // Child
        FILE* pFile;
        char buffer[256];
        ppid = getpid(); // Return the process ID (PID) of the calling process. (This is often used by routines that generate unique temporary filenames.) 

        pFile = fopen("logfile.txt", "a+"); // Return a FILE pointer. NULL is returned and the global variable errno is set to indicate the error.
        // pFile = NULL;

        if (pFile == NULL) {
            perror("Error opening file.");
            // printf("%d, %d\n", ppid, SIGTERM);
            kill(ppid, SIGTERM); // Trigger sig_handler() function
        }
        else {
            fprintf(pFile, "%s", "Executed by Jeong\n");
        }
        fclose(pFile);
    }
    else {  // Parent
        // Parent logic here
    }
}
