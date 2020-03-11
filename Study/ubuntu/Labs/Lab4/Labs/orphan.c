/*

An orphan process is a process whose parent has terminated.
The orphan will default back to init as its parent(PPID of 1).
The orphan will continue to run until it is killed.
    - kill -9 PID
    - Where PID is the process ID of the orphan

The child process is adopted by init process, when parent process dies.

*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    // Create a child process
    int pid = fork();

    if (pid > 0) {
        // If PID > 0 :: this is the parent 
        // This process performs printf and finishes
        printf("Parent process\n");
        sleep(10);
        exit(EXIT_SUCCESS); // Kill the parent
    }
    else if (pid == 0) {
        printf("Child process\n");
    }

    // Keep process running with infinite loop
    // When the parent finishes after 10 seconds.
    // The getppid() will return 1 as the parent (init process)
    while (1) {
        sleep(1);
        printf("child 1: my parent is: %i\n", getppid());
        // getppid() returns the process ID of the parent of the calling process.

        // if (getppid() == 1) {
        //     exit(EXIT_SUCCESS);
        // }
    }

    return 0;
}

