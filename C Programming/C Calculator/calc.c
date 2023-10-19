#include <stdio.h>

int main()
{
	int num1, num2, result, instances;
	char operation;
	printf("Input the number of instances: \n");
	scanf("%d", &instances);
	for (int i = 0; i < instances; ++i)
	{
		printf("Select an operation: \n");
		scanf("%c", &operation);
		switch (operation) {
			case ('+'):
				printf("Input two numbers: \n");
				scanf("%d", &num1);
				scanf("%d", &num2);
				result = num1 + num2;
				printf("The sum is %d\n", result);
				break;
			case ('-'):
				printf("Input two numbers: \n");
				scanf("%d", &num1);
				scanf("%d", &num2);
				result = num1 - num2;
				printf("The difference is %d\n", result);
				break;
			case ('*'):
				printf("Input two numbers: \n");
				scanf("%d", &num1);
				scanf("%d", &num2);
				result = num1 * num2;
				printf("The product is %d\n", result);
				break;
			case ('/'):
				printf("Input two numbers: \n");
				scanf("%d", &num1);
				scanf("%d", &num2);
				result = num1 / num2;
				printf("The quotient is %d\n", result);
				break;
			default:
				break;
			}
	}
	return 0;
}