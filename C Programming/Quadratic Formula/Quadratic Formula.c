#include <stdio.h>
#include <math.h>

double getSquareRoot(double num1);
double getSquare(double num1);
double getAbsValue(double num1);

int main(int argc, char const *argv[])
{
	double a, b, c, root1, root2, root, discriminantFormula;

	printf("Enter the value for a, b, and c: \n");

	scanf("%lf %lf %lf", &a, &b, &c);

	discriminantFormula = (getSquare(b)) - (4.0 * a * c);

	printf("%lf\n", discriminantFormula);

	if (discriminantFormula < 0.0)
	{
		printf("There are two roots these are: \n");
		root1 = -b + ((getSquareRoot(discriminantFormula)) / (2.0 * a));
		root2 = -b - ((getSquareRoot(discriminantFormula)) / (2.0 * a));
		printf("First root:\t%lf\nSecond root:\t%lf\n", root1, root2);
	}
 else if (discriminantFormula > 0.0) {
  root1 = -b + ((getSquareRoot(discriminantFormula)) / (2.0 * a));
		root2 = -b - ((getSquareRoot(discriminantFormula)) / (2.0 * a));
  printf("The roots are imaginary!\nThese are %.2lfi and %.2lfi\n");
	else{
		printf("There is only one root: \n");
		root = -b + ((getSquareRoot(discriminantFormula)) / (2.0 * a));
		printf("The root is:\t%lf\n", root);
	}
	return 0;
}

double getSquareRoot(double num1){
	return sqrt(num1);
}

double getSquare(double num1){
	return num1 * num1;
}

double getAbsValue(double num1){
 return abs(num1);
}