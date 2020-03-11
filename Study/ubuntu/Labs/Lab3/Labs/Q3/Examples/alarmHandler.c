#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <unistd.h>

void alarmHandler() {
	printf("wake up!\n");
	exit(0);
}

int main() {
	signal(SIGALRM, alarmHandler);
	alarm(6);
	printf("Infinite Loop\n");

	while(1) {
		sleep(1);
		printf("1 sec over\n");
	}
	
	printf("Not executed\n");
}
