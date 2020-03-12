#include <stdio.h>
#include <math.h>

void areaOfCircle(int r) {
    float area;
    int radius = r;

    printf("Radius : %d\n", radius);

    area = M_PI * radius * radius;

    printf("The area of the circle is: %f\n", area);
}
