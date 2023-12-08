#include <stdio.h>
#include <stdlib.h>

void validate_age(int val);
double Sum_Avg_Age(int *age);

int main()
{
	int stud_age[6], value;
	double average;

	for (int i = 0; i < 6; ++i){
		printf("Enter the value for element %d in array\n", i + 1);
		scanf("%d", &stud_age[i]);
		value = stud_age[i];
		validate_age(value);
	}

	average = Sum_Avg_Age(stud_age);

	printf("Average is %.2lf\n", average);
	
	return 0;
}

void validate_age(int val){
	if (val < 0){
		printf("Input is negative!\n");
		exit(1);
	}
	if (val > 50){
		printf("Input should not be more than 50!\n");
		exit(1);
	}
}

double Sum_Avg_Age(int *age){
	int sum, val;

	for (int i = 0; i < 6; ++i){
		val = age[i];
		sum += val;
	}
	return (double) sum / 6.0;
}