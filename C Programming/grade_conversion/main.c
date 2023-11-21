#include <stdio.h>

char convertGrade(int num1, int num2, int num3);

int main()
{
	int score1, score2, score3;
	char convertedGrade;

	printf("Enter 3 numbers from 0 to 100: \n");

	scanf("%d %d %d", &score1, &score2, &score3);

	convertedGrade = convertGrade(score1, score2, score3);

	printf("Your grade is %c.\n", convertedGrade);

	return 0;
}

char convertGrade(int num1, int num2, int num3){
	double average;

	average = (double) ((num1 + num2 + num3) / 3.0);

	if (average >= 90.0){
		return 'A';
	}
	else if (average >= 70.0 && average < 90.0) {
		if (num3 > 90){
			return  'A';
		}
		return 'B';
	}
	else if (average >= 50.0 && average < 70.0){
		if (((double)(num2 + num3) / 2.0) > 70){
			return 'C';
		}
		return 'D';
	}
	else {
		return 'F';
	}
}