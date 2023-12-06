#include <stdio.h>
#include <stdlib.h>

void validate_age(int *age);
int Sum_Avg_Age(int *age, int *sum);

int main(int argc, char const *argv[])
{
	int *stud_age, average, sum = 0;

	stud_age = (int*) malloc(6 * sizeof(int));

	for (int i = 1; i <= 6; ++i)
	{
		printf("Enter element %d in array\n", i);
		scanf("%d", stud_age + i);
		validate_age(stud_age);
		sum += *(stud_age + i);
	}

	average = sum / 6;
	printf("Average is %d\n", average);

	free(stud_age);

	return 0;
}

void validate_age(int *age){
	if (age < 0){
		printf("Invalid input for age!\n");
		exit(1);
	}
}

int Sum_Avg_Age(int *age, int *sum){
	*sum += *age;
	return *sum / 6;
}