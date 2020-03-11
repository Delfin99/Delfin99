#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "areaOfRectangle.h"

int main(int argc, char **argv) {

    // // The number of paramters 
    // printf("Total number of paramters: %d\n\n", argc);

    // printf("First parameter: %s\n", argv[0]);
    // printf("Second parameter: %s\n", argv[1]);
    // printf("Third parameter: %s\n", argv[2]);
    // printf("Fourth parameter: %s\n\n", argv[3]);

    if (strcmp(argv[1], "Rectangle") == 0 && argv[2] != NULL && argv[3] != NULL) {
        areaOfRectangle(atoi(argv[2]), atoi(argv[3]));
    }

    else if (strcmp(argv[1], "Circle") == 0 && argv[2] != NULL) {
        areaOfCircle(atoi(argv[2]));
    }

    else if (strcmp(argv[1], "Triangle") == 0 && argv[2] != NULL && argv[3] != NULL) {
        areaOfTriangle(atoi(argv[2]), atoi(argv[3]));
    }

    else {
        printf("Invalid arguments!\n");
    }
    
}