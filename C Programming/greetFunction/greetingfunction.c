#include <stdio.h>
#define MAX_LEN 100

void greet(char str[MAX_LEN]);
int main()
{
	char name[MAX_LEN];

	printf("Enter your name: ");
	scanf("%[^\n]%*c", name);
	greet(name);
	return 0;
}

void greet(char str[MAX_LEN]){
	printf("*********************************\n*\t\t\t\t*\n*\t%s\t*\n*\t\t\t\t*\n*********************************\n", str);
}

