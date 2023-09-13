#include <stdio.h>

int main(int argc, char const *argv[])
{
	int nums1;
	int nums2;
	int result;
	int instances;
	printf("Input the number of instances: \n");
	scanf("%d", &instances);
	for (int instances; instances > 0; --instances)
	{
		char operation;
		printf("Select an operation: \n");
		scanf("%c", &operation);
		if (operation == 'a')
		{
			printf("Input two numbers: \n");
			scanf("%d", &nums1);
			scanf("%d", &nums2);
			result = nums1 + nums2;
			printf("The sum is %d\n", result);
		}
		if (operation == 's')
		{
			printf("Input two numbers: \n");
			scanf("%d", &nums1);
			scanf("%d", &nums2);
			result = nums1 - nums2;
			printf("The difference is %d\n", result);
		}
		if (operation == 'm')
		{
			printf("Input two numbers: \n");
			scanf("%d", &nums1);
			scanf("%d", &nums2);
			result = nums1 * nums2;
			printf("The product is %d\n", result);
		}
		if (operation == 'd')
		{
			printf("Input two numbers: \n");
			scanf("%d", &nums1);
			scanf("%d", &nums2);
			result = nums1 / nums2;
			printf("The quotient is %d\n", result);
		}
		else {
			printf("Invalid operation!!\n");
			break;
		}
	}
	return 0;
}