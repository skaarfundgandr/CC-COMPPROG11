#include <stdio.h>
#include <math.h>

int main()
{
    double a, b, c, root1, root2, root;
    int discriminantFormula;

    printf("Enter the value for a, b, and c: \n");

    scanf("%lf %lf %lf", &a, &b, &c);

    discriminantFormula = pow(b, 2) - (4 * a * c);
 
    if (discriminantFormula < 0)
        printf("There ara no real roots\n");
    else if (a == 0.0 && b == 0.0)
        printf("There is no real solution!\n");
    else if (a == 0.0){
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