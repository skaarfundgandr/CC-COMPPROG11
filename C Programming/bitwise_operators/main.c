// Solution for hackerrank.com's bitwise operator challenge
#include <stdio.h>

void calculateTheMaximum(int n, int k);

int main()
{
  int n, k;

  scanf("%d %d", &n, &k);
  calculateTheMaximum(n, k);
  return 0;
}

void calculateTheMaximum(int n, int k){
  int a, calcAND, calcOR, calcXOR, maxAND, maxOR, maxXOR;
    for (int i = 0; i < n; ++i)
    {
      a = i - 1;
      calcAND = a & i;
      calcOR = a | i;
      calcXOR = a ^ i;
      (calcAND > maxAND && calcAND < k) ? maxAND = calcAND : maxAND;
      (calcOR > maxOR && calcOR < k) ? maxOR = calcOR : maxOR;
      (calcXOR > maxXOR && calcXOR < k) ? maxXOR = calcXOR : maxXOR;
    }
    printf("%d\n%d\n%d\n", maxAND, maxOR, maxXOR);
    return;
}