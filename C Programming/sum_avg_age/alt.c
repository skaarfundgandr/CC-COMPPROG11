#include <stdio.h>
#include <stdlib.h>
#ifdef _WIN32
#define CLEAR "cls"
#else
#define CLEAR "clear"
#endif

void validate_age(int val);
double Sum_Avg_Age(int *age);

int main()
{
	int stud_age[6], value;
	double average;

	for (int i = 0; i < 6; ++i){
		printf("Enter age for student %d\n", i + 1);
		scanf("%d", &stud_age[i]);
		validate_age(stud_age[i]);
	}
	system(CLEAR);
	average = Sum_Avg_Age(stud_age);

	printf("Average is %.2lf\n", average);
	
	return 0;
}

void validate_age(int val){
	if (val < 0){
		system(CLEAR);
		printf("Input is negative!\n");
		exit(1);
	}
	if (val >= 50){
		system(CLEAR);
		printf("Input should not be more than 50!\n");
		exit(1);
	}
}

double Sum_Avg_Age(int *age){
	int sum = 0;

	for (int i = 0; i < 6; ++i){
		sum += age[i];
	}
	return (double) sum / 6.0;
}