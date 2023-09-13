#include <stdio.h>

int main(int argc, char const *argv[])
{
	char operation;
	int nums1;
	int nums2;
	int result;
	int instances;
	printf("Input the number of instances: \n");
	scanf("%d", &instances);
	for (int instances; instances > 0; --instances)
	{
		printf("Select an operation: \n");
		scanf("%c", &operation);
		printf("Input two numbers: \n");
		scanf("%d", &nums1);
		scanf("%d", &nums2);
		if (operation == a)
		{
			result = nums1 + nums2;
			printf("The sum is %d\n", result);
		}
		if (operation == s)
		{
			result = nums1 - nums2;
			printf("The difference is %d\n", result);
		}
		if (operation == m)
		{
			result = nums1 * nums2;
			printf("The product is %d\n", result);
		}
		if (operation == d)
		{
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