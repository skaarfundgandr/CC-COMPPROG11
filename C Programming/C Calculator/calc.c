#include <stdio.h>

int main()
{
	int nums1, nums2, result, instances;
	char operation;
	printf("Input the number of instances: \n");
	scanf_s("%d", &instances);
	while (instances > 0)
	{
		--instances;
		printf("Select an operation: \n");
		scanf_s("%c", &operation);
		switch (operation) {
			case ('+'):
				printf("Input two numbers: \n");
				scanf_s("%d", &nums1);
				scanf_s("%d", &nums2);
				result = nums1 + nums2;
				printf("The sum is %d\n", result);
				break;
			case ('-'):
				printf("Input two numbers: \n");
				scanf_s("%d", &nums1);
				scanf_s("%d", &nums2);
				result = nums1 - nums2;
				printf("The difference is %d\n", result);
				break;
			case ('*'):
				printf("Input two numbers: \n");
				scanf_s("%d", &nums1);
				scanf_s("%d", &nums2);
				result = nums1 * nums2;
				printf("The product is %d\n", result);
				break;
			case ('/'):
				printf("Input two numbers: \n");
				scanf_s("%d", &nums1);
				scanf_s("%d", &nums2);
				result = nums1 / nums2;
				printf("The quotient is %d\n", result);
				break;
			default:
				break;
			}
	}
	return 0;
}