#include <stdio.h>
#include <stdlib.h>
#ifdef _WIN32
#define CLEAR "cls"
#else
#define CLEAR "clear"
#endif

int main(int argc, char const *argv[]){
    int n, i = 0, j = 0;
    double *nums, *numptr, standardDeviation, sum = 0, sumAvg2 = 0, avg, avgSquare;
    system(CLEAR);
    printf("Enter the number of values");
    scanf("%d", &n);

    nums = (double *) malloc(sizeof(double) * n);
    numptr = nums;

    system(CLEAR);
    while (i < n){
        j = i;
        printf("\tXi\tXi * Xi\n");
        printf("\t");
        scanf("%lf", &numptr[i]);

        while(numptr != NULL){

        }
        ++i;
        if (i == n) printf("\n");
    }

}
