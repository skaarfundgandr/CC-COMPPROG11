#include <stdio.h>
#include <string.h>
#define MAX_LEN	50

int parkingHour, parkingMinute;
char vehicle[MAX_LEN];

int getRoundedTotal(int hour, int minute);
void getParkingTime(int hourEntered, int hourLeft, int minuteEntered, int minuteLeft);
void getVehicle(char type);
int getRate(char type);
double getTotalCharge(int rate, int total);

int main()
{
	char vehicleType;
	int hourEntered, hourLeft, minuteEntered, minuteLeft, roundedTotal, totalCharge;

	printf("Type of vehicle?\t\t\t");
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
	getVehicle(vehicleType);
	totalCharge = getTotalCharge(getRate(vehicleType), roundedTotal);

	printf("\t\tPARKING LOT CHARGE\t\t\n\n");
	printf("Type of vehicle:\t\t%s\n", vehicle);
	printf("TIME-IN\t\t\t\t%2d:%2d\n", hourEntered, minuteEntered);
	printf("TIME-OUT\t\t\t%2d:%2d\n", hourLeft, minuteLeft);
	printf("\t\t\t\t--------\n");
	printf("PARKING TIME\t\t\t%2d:%2d\n", parkingHour, parkingMinute);
	printf("ROUNDED TOTAL\t\t\t%5d\n", roundedTotal);
	printf("\t\t\t\t--------\n");
	printf("TOTAL CHARGE\t\t\t$%4.2d\n", totalCharge);	

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
	if (minute >= 30){
		return ++hour;
	}
	else{
		return hour;
	}
}

void getVehicle(char type){
	if (type == 'C' || type == 'c'){
		strcpy(vehicle, "Car");
	}
	else if (type == 'B' || type == 'b') {
		strcpy(vehicle, "Bus");
	}
	else if (type == 'T' || type == 't') {
		strcpy(vehicle, "Truck");
	}
}

int getRate(char type){
	if (type == 'C' || type == 'c'){
		return 1;
	}
	else if (type == 'T' || type == 't') {
		return 2;
	}
	else if (type == 'B' || type == 'b'){
		return 3;
	}
	else {
		return 0;
	}
}

double getTotalCharge(int rate, int total){
	switch (rate) {
		case 1:
			if (total <= 3){
				return 0.0;
				break;
			}
			else{
				return (double) (total - 3.0) * 1.5;
				break;
			}
			break;
		case 2:
			if (total <= 2){
				return 1.0;
				break;
			}
			else{
				return (double) ((total - 2.0) * 2.30) + 1.0;
				break;
			}
			break;
		case 3:
			if (total <= 1){
				return 2.0;
				break;
			}
			else{
				return (double) ((total - 1.0) * 3.70) + 2.0;
				break;
			}
			break;
		default:
			return 0;
			break;

	}
}