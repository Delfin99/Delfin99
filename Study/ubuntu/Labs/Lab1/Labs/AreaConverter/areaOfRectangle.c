#include <stdio.h>

void areaOfRectangle(int s1, char s2) {
    int area;
    int side1 = s1;
    int side2 = s2;

    printf("Side 1: %d\n", side1);
    printf("Side 2: %d\n", side2);

    area = side1 * side2;

    printf("The area of the rectangle is: %d\n", area);

}