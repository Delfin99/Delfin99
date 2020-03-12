/*
    2. Write a C program to offer the following functionality:
        a. List all the processes running on a system if no params are
        passed via the command line
        b. Search for a process by name eg. ./myprog search
        calculator
        c. Kill a process for a given IPD rg. ./myprog kill 1292
*/


#include <stdio.h>
#include <sys/types.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main(int argc, char* argv[]) {
    
    char* ps_list[] = {"ps", "aux", NULL};
    char* kill_list[] = {"kill", "-9", 0, NULL};
    pid_t pid;

    if (argc == 1) {
        pid = fork();

        if (pid == 0) { // fork() returns 0 to the child process.
            printf("Executing command ps...\n");
            execvp(ps_list[0], ps_list);
        }
        else {  // parent
            int status = 0;
            wait(&status);
            printf("Child process is returned with: %d.\n", status);
        }
    }
    else if (argc == 3) {      

        if (strcmp(argv[1], "kill")==0 ) {

            kill_list[2] = argv[2];

            if (pid == 0) {
                printf("Executing command kill...\n");
                execvp(kill_list[0], kill_list);
            }
            else {
                int status = 0;
                wait(&status);
                printf("Child process is returned with: %d.\n", status);
            }
        }
        else if (strcmp(argv[1], "search")==0) {
        
            char* ps_list_name[] = {"pgrep", argv[2], NULL};

            if (pid == 0) {
                printf("Executing command search...\n");
                execvp(ps_list_name[0], ps_list_name);
            }
            else {
                int status = 0;
                wait(&status);
                printf("Child process is returned with: %d.\n", status);
            }            
        }

    }
}