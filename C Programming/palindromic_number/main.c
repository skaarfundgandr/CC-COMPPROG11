#include <stdio.h>

int main()
{
	int num, digit1, digit3;
	printf("Enter a 3 digit number:\n");
	scanf("%d", &num);

	if (num < 100 || num > 999){
		printf("Invalid input!\n");
	}

	else{
		digit1 = num % 10;
		digit3 = num / 100 % 10;
		(digit1 == digit3) ? printf("Palindromic!\n"):
		printf("Non Palindromic!\n");
	}
	return 0;
}