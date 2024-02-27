#include <stdio.h>
int add(int x, int y);

int main(int argc, char const *argv[]){
    int num1, num2;

    printf("Enter two numbers: \n");
    scanf("%d%d", &num1, &num2);

    printf("%d + %d = %d\n", num1, num2, add(num1, num2));

    return 0;
}

int add(int x, int y){
    int carry;

    while(y != 0){
        carry = x & y;
        x = x ^ y;
        y = carry << 1;
    }
    return x;
}
