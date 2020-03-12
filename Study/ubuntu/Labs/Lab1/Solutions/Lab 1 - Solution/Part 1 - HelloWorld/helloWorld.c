#include <stdio.h>

int main( int argc, char *argv[] )  {
   int side1 = atoi(argv[1]);
 
   int side2 = atoi(argv[2]);
   int area = side1 * side2; 
   printf("Area is: %d\n", area);
   
}
