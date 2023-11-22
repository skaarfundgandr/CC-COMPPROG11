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

    discriminantFormula = squareOf(b) - (4 * a * c);

    
    if (discriminantFormula < 0) {
        root1 = -b + (sqrt(abs(discriminantFormula)) / (2.0 * a));
        root2 = -b - (sqrt(abs(discriminantFormula)) / (2.0 * a));
        printf("The roots are imaginary!\nThese are %.2lfi and %.2lfi\n", root1, root2);
    } 
    else if (a == 0.0 && b == 0.0) {
        printf("There is no real solution!\n");
    }
    else if (a == 0.0) {
        root = -c / b;
        printf("There is only one root.\nWhich is %.2lf.\n", root);
    }
    else {
        root1 = -b + (sqrt(discriminantFormula) / (2.0 * a));
        root2 = -b - (sqrt(discriminantFormula) / (2.0 * a));
        printf("There are two roots\nThese are %.2lf and %.2lf.\n", root1, root2);
    }
    return 0;
}

double squareOf(double num1){
    return num1 * num1;
}
