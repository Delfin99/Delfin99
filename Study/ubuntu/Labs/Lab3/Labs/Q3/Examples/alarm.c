#include <stdio.h>
//#include <stdlib.h>
#include <unistd.h>

int main() {
	alarm(6);
	printf("Infinite Loop\n");
	while (1) {
		sleep(1);
		printf("Over 1 sec\n");
	}
	printf("Not executed\n");
}
