#include <stdio.h>
#define MAX_SIZE 50

void strLen(char *str);

int main(){
	char string[MAX_SIZE];

	printf("Enter a string: \n");
	scanf("%s", string);

	strLen(string);
	return 0;
}

void strLen(char *str){
	int len = 0;
	for (int i = 0; str[i] != '\0'; i++){
		++len;
	}
	printf("String size is %d\n", len);
}