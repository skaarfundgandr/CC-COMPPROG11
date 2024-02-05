#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){
    int t, c; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        long int n, sum, third, fifth, fifteenth;
        scanf("%li",&n);
        --n;
        third = n / 3;
        fifth = n / 5;
        fifteenth = n / 15;
        printf("%li\n", 3 * (third * (third + 1) / 2) + 5 * (fifth * (fifth + 1) / 2) - (15 * (fifteenth * (fifteenth + 1) / 2)));
        while ((c = getchar()) != '\n' && c != EOF) {}
    }
    return 0;
}
