#include <stdio.h>

double roundOff(double num);

int main()
{
	double input, result;
	printf("Enter a number:\n");
	scanf("%lf", &input);

	result = roundOff(input);
	printf("%lf rounded off to the nearest hundredths is: %.6lf\n", input, result);
	return 0;
}

double roundOff(double num){
	if (num >= 0.05) {
		num = num * 100;
		num = (int) num / 100.0;
		num += 0.01;
	}
	else {
	num = num * 100;
	num = (int) num / 100.0;
	}
	return num;
}