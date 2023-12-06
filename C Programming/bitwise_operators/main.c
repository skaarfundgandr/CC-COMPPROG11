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
  for (int i = 1; i < n; i++)
  {
    for (int j = i + 1; j <= n; j++)
    {
      if ((j & i) > maxAND && (j & i) < k)
        maxAND = j & i;
      if ((j | i) > maxOR && (j | i) < k)
        maxOR = j | i;
      if ((j ^ i) > maxXOR && (j ^ i) < k)
        maxXOR = j ^ i;
    }
  }
  printf("%d\n%d\n%d\n", maxAND, maxOR, maxXOR);
  return;
}