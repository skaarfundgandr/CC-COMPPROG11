#include <stdio.h>

int main()
{
	int amount, total;
	printf("Enter the amount of money: \n");
	scanf("%d", &amount);
	total = amount / 1000;
	printf("1000 PHP = %d\n", total);
	amount = amount - (total * 1000);
	total = amount / 500;
	printf("500 PHP = %d\n", total);
	amount = amount - (total * 500);
	total = amount / 200;
	printf("200 PHP = %d\n", total);
	amount = amount - (total * 200);
	total = amount / 100;
	printf("100 PHP = %d\n", total);
	amount = amount - (total * 100);
	total = amount / 50;
	printf("50 PHP = %d\n", total);
	amount = amount - (total * 50);
	total = amount / 20;
	printf("20 PHP = %d\n", total);
	amount = amount - (total * 20);
	total = amount / 10;
	printf("10 PHP = %d\n", total);
	amount = amount - (total * 10);
	total = amount / 5;
	printf("5 PHP = %d\n", total);
	amount = amount - (total * 5);
	total = amount;
	printf("1 PHP = %d\n", total);
	return 0;
}