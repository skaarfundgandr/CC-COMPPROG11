#include <stdio.h>
#include <math.h>
#include <stdlib.h>

double squareOf(double num1);

int main()
{
	double a, b, c, root1, root2, root;
	int discriminantFormula;

	printf("Enter the value for a, b, and c: \n");

	scanf("%lf %lf %lf", &a, &b, &c);

	discriminantFormula = (squareOf(b)) - (4 * a * c);

	
	if (discriminantFormula < 0) {
  		root1 = -b + (sqrt(abs(discriminantFormula)) / (2.0 * a));
		root2 = -b - (sqrt(abs(discriminantFormula)) / (2.0 * a));
  		printf("The roots are imaginary!\nThese are %.2lfi and %.2lfi\n", root1, root2);
  	} else if (discriminantFormula > 0) {
		printf("There are two roots these are: \n");
		root1 = -b + ((sqrt(discriminantFormula)) / (2.0 * a));
		root2 = -b - ((sqrt(discriminantFormula)) / (2.0 * a));
		printf("First root:\t%lf\nSecond root:\t%lf\n", root1, root2);
	}
	
	else {
		printf("There is only one root: \n");
		root = -b + ((sqrt(discriminantFormula)) / (2.0 * a));
		printf("The root is:\t%lf\n", root);
	}
	return 0;
}

double squareOf(double num1){
	return num1 * num1;
}
