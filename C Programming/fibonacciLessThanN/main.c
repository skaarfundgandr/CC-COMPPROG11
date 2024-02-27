#include <stdio.h>

int fibonacciLessThanN(int n);

int main(int argc, char const *argv[]){
    int n;

    printf("Enter the value for n: \n");
    scanf("%d", &n);

    for (int i = 0; fibonacciLessThanN(i) < n; ++i) {
        printf("%d ", fibonacciLessThanN(i));
    }
    printf("\n");

    return 0;
}

int fibonacciLessThanN(int n){
    if (n == 0 || n == 1) {
        return n;
    }
    return fibonacciLessThanN(n - 1) + fibonacciLessThanN(n - 2);
}
