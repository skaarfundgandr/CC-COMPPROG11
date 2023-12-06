#include <stdio.h>
#include <stdlib.h>

void validate_age(int *age);
int Sum_Avg_Age(int *ages);

int main()
{
	int *stud_age, average;

	stud_age = (int*) malloc(sizeof(int) * 6);

	for (int i = 0; i < 6; ++i){
		printf("Enter element %d in array\n", i + 1);
		scanf("%d", stud_age + i);
		validate_age(stud_age);
	}

	average = Sum_Avg_Age(stud_age);

	free(stud_age);
	
	printf("Average is %d\n", average);
	return 0;
}

void validate_age(int *age){
	if (age[0] < 0){
		printf("Invalid input for age!\n");
		exit(1);
	}
}

int Sum_Avg_Age(int *ages){
	int sum;
	for (int i = 0; i < 6; ++i)
		sum += ages[i];
	return sum / 6;
}