#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
    int pid;
    int data = 10;

    pid = fork();

    if (pid == 0) {
        data = data + 10;
        sleep(20);
    }
    else {
        data = data - 10;
        exit(0);
    }

    printf("data: %d\n", data);

    return 0;
}