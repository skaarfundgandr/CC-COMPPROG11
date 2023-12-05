#include <stdio.h>
#include <ctype.h>

int parkingHour, parkingMinute;

int getRoundedTotal(int hour, int minute);
void getParkingTime(int hourEntered, int hourLeft, int minuteEntered, int minuteLeft);
void printVehicleType(char type);
double getTotalCharge(char vehicleType, int total);

int main()
{
	char vehicleType;
	int hourEntered, hourLeft, minuteEntered, minuteLeft, roundedTotal;
	double totalCharge;

	printf("Type of vehicle?\t\t");
	scanf("%c", &vehicleType);
	printf("\nHour vehicle entered lot (0 - 24)?\t");
	scanf("%d", &hourEntered);
	printf("\nMinute vehicle entered lot (0 - 60)?\t");
	scanf("%d", &minuteEntered);
	printf("\nHour vehicle left lot (0 - 24)?\t\t");
	scanf("%d", &hourLeft);
	printf("\nMinute vehicle left lot (0 - 60)?\t");
	scanf("%d", &minuteLeft);

	getParkingTime(hourEntered, hourLeft, minuteEntered, minuteLeft);
	roundedTotal = getRoundedTotal(parkingHour, parkingMinute);
	totalCharge = getTotalCharge(vehicleType, roundedTotal);

	printf("\tPARKING LOT CHARGE\n\n");
	printVehicleType(vehicleType);
	printf("TIME-IN\t\t\t%02d:%02d\n", hourEntered, minuteEntered);
	printf("TIME-OUT\t\t%02d:%02d\n", hourLeft, minuteLeft);
	printf("\t\t\t--------\n");
	printf("PARKING TIME\t\t%02d:%02d\n", parkingHour, parkingMinute);
	printf("ROUNDED TOTAL\t\t%5d\n", roundedTotal);
	printf("\t\t\t--------\n");
	printf("TOTAL CHARGE\t\t$%4.2lf\n", totalCharge);	

	return 0;
}

void getParkingTime(int hourEntered, int hourLeft, int minuteEntered, int minuteLeft){
	if (minuteLeft < minuteEntered){
		--hourLeft;
		minuteLeft += 60;
		parkingHour = hourLeft - hourEntered;
		parkingMinute = minuteLeft - minuteEntered;
	}
	else{
		parkingHour = hourLeft - hourEntered;
		parkingMinute = minuteLeft - minuteEntered;
	}
}

int getRoundedTotal(int hour, int minute){
	if (minute >= 30)
		return ++hour;
	else
		return hour;
}

void printVehicleType(char type){
	if (type == 'C' || type == 'c')
		printf("Type of vehicle: Car\n");
	if (type == 'B' || type == 'b')
		printf("Type of vehicle: Bus\n");
	if (type == 'T' || type == 't')
		printf("Type of vehicle: Truck\n");
}

double getTotalCharge(char vehicleType, int total){
	switch (toupper(vehicleType)) {
		case 'C':
			if (total <= 3){
				return 0.0;
			}
			else{
				return (double) (total - 3.0) * 1.5;
			}
			break;
		case 'B':
			if (total <= 2){
				return 1.0;
			}
			else{
				return (double) ((total - 2.0) * 2.30) + 1.0;
			}
			break;
		case 'T':
			if (total <= 1){
				return 2.0;
			}
			else{
				return (double) ((total - 1.0) * 3.70) + 2.0;
			}
			break;
		default:
			printf("Invalid input!");
			return 0;
			break;
	}
}