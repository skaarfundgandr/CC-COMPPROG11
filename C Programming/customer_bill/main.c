#include <stdio.h>
// Tax rate and labor are constants that will be used
// on multiple functions so it should be a defined constant
#define TAX_RATE 0.085
#define LABOR_COST 0.35

double getCarpetCharge(int area, double cost);
double getLaborCharge(int area);
double getDiscount(int discount, double price);
double convToPercent(int percent);
double getTax(double num1);
double getTotalAmt(double amt1, double amt2);

int main()
{
	int length, width, custDiscount, area;
	double costPerSqrFoot, carpetCharge, laborCharge, installedPrice, discount, subTotal, tax, totalCost;

	printf("Length of room (feet)?\t\t");
	scanf("%d", &length);

	printf("\nWidth of room (feet)?\t\t");
	scanf("%d", &width);
	
	printf("\nCustomer discount (percent)?\t");
	scanf("%d", &custDiscount);

	printf("\nCost per square foot (xxx.xx) ?\t");
	scanf("%lf", &costPerSqrFoot);
	
	// Note that ordering is important since the compiler reads your code from top to bottom.
	// DO NOT USE A VARIABLE THAT HAS NOT BEEN INITIALIZED FIRST
	
	area = length * width;
	carpetCharge = getCarpetCharge(area, costPerSqrFoot);
	laborCharge = getLaborCharge(area);
	installedPrice = getTotalAmt(carpetCharge, laborCharge);
	discount = getDiscount(custDiscount, installedPrice);
	subTotal = getTotalAmt(installedPrice, discount);
	tax = getTax(subTotal);
	totalCost = getTotalAmt(subTotal, tax);
	// OUTPUT
	printf("\n\t\tMEASUREMENT\t\t\n\nLength\t\t\t\t%5d ft\n", length);
	printf("Width\t\t\t\t%5d ft\n", width);
	printf("Area\t\t\t\t%5d ft\n\n", area);
	printf("\t\tCHARGES\t\t\n\nDESCRIPTION\tCOST/SQ.FT.\tCHARGE\n");
	printf("-----------\t-----------\t----------\n");
	printf("Carpet\t\t%9.2lf\t$%7.2lf\n", costPerSqrFoot, carpetCharge);
	printf("Labor\t\t%9.2lf\t%8.2lf\n", LABOR_COST, laborCharge);
	printf("\t\t\t\t----------\n");
	printf("INSTALLED PRICE\t\t\t%8.2lf\n", installedPrice);
	printf("Discount\t%9d\t%8.2lf\n", custDiscount, discount);
	printf("-----------\t-----------\t----------\n");
	printf("SUBTOTAL\t\t\t%8.2lf\n", subTotal);
	printf("Tax\t\t\t\t%8.2lf\n", tax);
	printf("TOTAL\t\t\t\t%8.2lf\n", totalCost);

	return 0;
}

double convToPercent(int percent){
	// Converts the input to a double and then divides it by 100.0 to convert it to a decimal
	return (double) percent / 100.0;
}

double getCarpetCharge(int area, double cost){
	// Since the data type of area is an integer, convert it to a double first to make
	// sure that the output would be accurate
	return (double) area * cost;
}

double getLaborCharge(int area){
	// This function takes an integer as an input and then multiplies it to a double
	// so it should be converted to a double first.
	return (double) area * LABOR_COST;
}

double getDiscount(int discount, double price){
	// This function calls the output of another function to process its input
	// despite the inputs being two different data types (int and double)
	// converting the int to double is unnecessary since the function convToPercent
	// returns a double
	return convToPercent(discount) * price;
}

double getTotalAmt(double amt1, double amt2){
	return amt1 + amt2;
}

double getTax(double num1){
	return num1 * TAX_RATE;
}