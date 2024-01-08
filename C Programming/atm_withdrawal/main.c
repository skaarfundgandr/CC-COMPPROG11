#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#ifdef _WIN32
#define CLEAR "cls"
#else
#define CLEAR "clear"
#endif

unsigned long amount = 25000, deposit, withdraw;
int choice, pin, i;
char transaction;

int main(){
	system(CLEAR);
	transaction = 'y';
	do{
		int attempts = 1;
		printf("ENTER YOUR PIN NUMBER: ");
		scanf("%d", &pin);
		while ((pin != 1020) && attempts <=3){
			printf("\nINVALID PASSWORD! PLEASE TRY AGAIN\n");
			printf("ENTER YOUR PIN NUMBER: ");
			while((i = getchar()) != '\n') {}
			scanf("%d", &pin);
			if (attempts == 3){
				printf("\nACCOUNT LOCKED\n");
				abort();
			}
			++attempts;
		}
		while (tolower(transaction) == 'y'){
			printf("\nWelcome to ATM Service!\n");
			printf("1. Check Balance\n");
			printf("2. Withdraw Cash\n");
			printf("3. Deposit Cash\n");
			printf("4. Quit\n");
			printf("\n\n");
			printf("Enter your choice: ");
			scanf("%d", &choice);

			switch (choice){
				case 1:
					printf("Your balance = Rs.%lu\n", amount);
					break;
				case 2:
					printf("\nEnter the amount:");
					scanf("%lu", &withdraw);
					if ((withdraw % 100) == 0){
						if (withdraw <= 0){
							printf("Please input a positive number!\n");
							abort();
						}
						if (withdraw > amount){
							printf("INSUFFICIENT BALANCE!\n");
						}
						else{
							amount -= withdraw;
							printf("\n\n Please collect your cash");
							printf("\n Your current balance = Rs.%lu", amount);
						}
					}
					else{
						printf("Please enter the amount in multiples of 100\n");
					}
					break;
				case 3:
					printf("\nEnter the amount: ");
					scanf("%lu", &deposit);
					if (deposit <= 0){
						printf("Enter a positive number!\n");
						abort();
					}
					amount += deposit;
					printf("Your balance = Rs.%lu\n", amount);
					break;
				case 4:
					printf("Thank you for using our ATM service!\n");
					exit(0);
					break;
				default:
					printf("Invalid choice\n");
					exit(1);
					break;
			}
			printf("\n\n\nDO U WISH TO HAVE ANOTHER TRANSCATION?(y/n): ");
			while((i = getchar()) != '\n') {}
			scanf("%c", &transaction);
			if (tolower(transaction) == 'n'){
				printf("Thank you for using our ATM service!\n");
				exit(0);
			}
		}
	} while (pin == 1020);
	return 0;
}