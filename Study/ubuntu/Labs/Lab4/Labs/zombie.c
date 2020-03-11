/*

When a process terminates, it isn't removes straight away from memory.
The process status becomes EXIT_ZOMBIE and its parent is notified via SIGCHLD signal.The parent should execute the wait() system call to read the child processes exit status.
Once the parent has processed this information from the child, the terminated process can be removed from memory.
If the parent is unable to process this information the child process becomes a Zombie Process.

*/
/*
Child becomes Zombie as parent is sleeping when child process exits.
*/
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main() {
    // Fork returns process id in parent process
    pid_t child_pid = fork();
    
    // Parent process
    if (child_pid > 0) {
        sleep(100);
    }
    else {  // Child process
        exit(1);
    }

    return 0;
}