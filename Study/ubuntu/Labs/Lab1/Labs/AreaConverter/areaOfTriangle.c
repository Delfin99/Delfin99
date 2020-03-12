#include <stdio.h>
#include <math.h>

void areaOfTriangle(int s1, int s2) {
    float area;
    int height = s1; // height
    int base = s2; // base

    printf("Height : %d\n", height);
    printf("Base : %d\n", base);

    area = (height * base) / (float) 2;

    printf("The area of the triangle is: %f\n", area);
}