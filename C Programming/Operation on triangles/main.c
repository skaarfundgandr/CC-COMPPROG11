#include <stdio.h>
#include <math.h>

double triangleSideLenCalculation(double a, double b);
double areaOfTriangle(double a, double b);
double perimeterOfTriangle(double a, double b, double c);


int main()
{
	double sideA, sideB ,sideC, area, perimeter;

	printf("Enter sides a and b: \n");
	scanf("%lf %lf", &sideA, &sideB);

	sideC = triangleSideLenCalculation(sideA, sideB);
	area = areaOfTriangle(sideA, sideB);
	perimeter = perimeterOfTriangle(sideA, sideB, sideC);

	printf("Area of the triangle is:\t%lf\nPerimeter of the triangle is:\t%lf\n", area, perimeter);
	return 0;
}

double triangleSideLenCalculation(double a, double b){
	double output;

	output = ((a * a) + (b * b));
	output = sqrt(output);
	return output;
}

double areaOfTriangle(double a, double b){
	double output;

	output = (a * b) / 2.0;
	return output;
}

double perimeterOfTriangle(double a, double b, double c){
	return a + b + c;
}