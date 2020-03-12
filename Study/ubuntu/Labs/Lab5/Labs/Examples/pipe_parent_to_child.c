#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main(void) {
	int fd[2], n, rc = 0;
	pid_t childPid;
	char string[] = "Hello World\n";
	char buffer[50];

	if ((rc = pipe(fd)) < 0 ) {
		fprintf(stderr, "Creating Pipe is failed\n");
		return 0;
	}

	/*
	 * fd[0] : descriptor for reading
	 * df[1] : descriptor for writing
	 *
	*/

	if ((childPid = fork()) == -1) {
		fprintf(stderr, "Creating child is failed\n");
		return 0;
	}

	int cnt = 3;
	

	if (childPid > 0) { // In parent process
		close(fd[0]);
		
		while ((cnt--)) {
			memset(buffer, 0x00, sizeof(buffer));
            printf("Input msg (in parent process) : ");
            scanf("%s", buffer);
			// n = read(fd[0], buffer, sizeof(buffer));
            write(fd[1], buffer, strlen(buffer));

            sleep(1);
			// fprintf(stdout, "%d Recevied (in Parent process) : %s\n", pcnt++, buffer);
		}	
	}
	else {
		close(fd[1]);
        int pcnt = 1;

		while (cnt--) {
			memset(buffer, 0x00, sizeof(buffer));
			// printf("Input msg (in child process) : ");
			// scanf("%s", buffer);
			// sprintf(buffer, "Hello\n");
			// write(fd[1], buffer, strlen(buffer));
			// sleep(1);
            n = read(fd[0], buffer, sizeof(buffer));
            fprintf(stdout, "%d Recevied (in child process) : %s\n", pcnt++, buffer);
		}
	}
}
