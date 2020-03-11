#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <unistd.h>

void intHandler() {
	printf("\ninterrupt signal\n");
	exit(0);
}

int main() {
	signal(SIGINT, intHandler);
	printf("Infinite Loop\n");
	while (1) {
		pause();
	}
	printf("Not executed\n");
}
