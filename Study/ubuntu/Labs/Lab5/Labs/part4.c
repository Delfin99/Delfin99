#include <stdio.h>
#include <stdlib.h>

int main() {
	FILE *fp;
	FILE *fp2;
	int status;
	char path[1024];
	char path2[1024];

	fp = popen("ls -al", "r");
	// fp2 = popen("awk '{print $1}'", "r");

	// fgets(path, 1024, fp);

	while (fgets(path, 1024, fp) != NULL) {
		// fp2 = popen("awk '{print $1}'", "r");
		// fputs(path, fp);
		// fprintf(fp, "awk '{printf $1}'\n");
		printf("%s", path);
	}
	// fprintf(fp, "awk '{printf $1}'\n");
	// fp2 = popen("awk '{print $1}'", "r");

	// while (fgets(path2, 1024, fp2) != NULL) {
	// 	printf("%s", path2);
	// }

	printf("Out\n");

	status = pclose(fp);
	// status = pclose(fp2);

	return 0;
}
