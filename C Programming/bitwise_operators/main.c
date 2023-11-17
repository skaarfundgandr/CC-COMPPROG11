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
  maxAND = maxOR = maxXOR = 0;
  for (int i = 2; i < n; ++i)
  {
    if (i == 2)
    {
      a = i;
    }
    else {
      a = i - 1;
    }
    calcAND = a & i;
    calcOR = a | i;
    calcXOR = a ^ i;
    if (calcAND > maxAND && calcAND < k)
    {
      maxAND = calcAND;
    }
    if (calcOR > maxOR && calcOR < k)
    {
      maxOR = calcOR;
    }
    if (calcXOR > maxXOR && calcXOR < k) 
    {
      maxXOR = calcXOR;
    }
  }
  printf("%d\n%d\n%d\n", maxAND, maxOR, maxXOR);
  return;
}