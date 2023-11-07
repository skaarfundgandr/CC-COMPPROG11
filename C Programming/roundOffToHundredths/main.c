#include <stdio.h>

float roundOff(float num);

int main(int argc, char const *argv[])
{
	float input, result;
	printf("Enter a number:\n");
	scanf("%f", &input);

	result = roundOff(input);
	printf("%f rounded off to the nearest hundredths is: %.2f\n", input, result);
	return 0;
}

float roundOff(float num){
	num = num * 100;
	num = (int) num / 100.0;

	return num;
}