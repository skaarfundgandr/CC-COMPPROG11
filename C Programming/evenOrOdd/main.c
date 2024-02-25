#include <stdio.h>

void evenOrOdd(int num);

int main(){
	int input;

	printf("Enter a number: ");
	scanf("%d", &input);

	evenOrOdd(input);
	return 0;
}

void evenOrOdd(int num){
	char str[] = "EOvdedn";

	for (int i = num % 2; i < (sizeof(str)/sizeof(str[0])); i += 2){
		printf("%c", str[i]);
	}
	printf("\n");
}