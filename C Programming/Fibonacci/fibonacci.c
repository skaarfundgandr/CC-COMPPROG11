#include <stdio.h>

int fibonacci(int n){
	if (n == 0 || n == 1){
		return n;
	}
	return fibonacci(n-1) + fibonacci(n-2);
}

int main()
{
	int terms;
	printf("Enter the number of terms: ");
	scanf_s("%d", &terms);
	for (int i = 0; i < terms;) {
		terms--;
		printf("%d\n", fibonacci(terms));
	}
	return 0;
}
