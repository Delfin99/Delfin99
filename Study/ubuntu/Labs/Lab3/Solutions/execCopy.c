#include <stdio.h>
#include <stdlib.h>
#include <unistd.h> /* for fork */
#include <sys/types.h> /* for pid_t */
#include <sys/wait.h> /* for wait */

int main()
{

   char *argv[]={"cp","-r","/home/jmccarthy/Documents/Apps/week3/execExample/Live","/home/jmccarthy/Documents/Apps/week3/execExample/Backup",NULL};
   //argv[0] is the command to run: echo
   //argv[1] text to be echoed
   //argv[2] null, needed!!
   execlp("/bin/cp","cp","-r","/home/jmccarthy/Documents/Apps/week3/execExample/Live","/home/jmccarthy/Documents/Apps/week3/execExample/Backup",NULL);
   printf("Im the last thing in this program to output!!"); 

   return 0;
}
