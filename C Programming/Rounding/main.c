#include <stdio.h>

double roundOff(double num);
double floorValue(double num);
double ceilingValue(double num);

int main()
{
	double input,nearestHundredths, floor, ceiling;
	printf("Enter a number:\n");
	scanf("%lf", &input);

	nearestHundredths = roundOff(input);
	floor = floorValue(input);
	ceiling = ceilingValue(input);
	printf("Floor value:\t\t%.6lf\nCeiling value:\t\t%.6lf\nNearest hundredths:\t%.6lf\n", floor, ceiling, nearestHundredths);
	return 0;
}

double roundOff(double num){
	double output;
	output = num + 0.005;
	output = output * 100.0;
	output = (int) output / 100.0;
	
	return output;
}

double floorValue(double num){
	return (int) num;
}

double ceilingValue(double num){
	num = num + 0.999999;

	return (int) num;
}