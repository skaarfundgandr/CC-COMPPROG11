#include <stdio.h>


#define TAX_RATE 0.085
#define LABOR_COST 0.35

int getArea(int ln, int wd);
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
	
	area = length * width;
	carpetCharge = getCarpetCharge(area, costPerSqrFoot);
	laborCharge = getLaborCharge(area);
	installedPrice = getTotalAmt(carpetCharge, laborCharge);
	discount = getDiscount(custDiscount, installedPrice);
	subTotal = getTotalAmt(installedPrice, discount);
	tax = getTax(subTotal);
	totalCost = getTotalAmt(subTotal, tax);

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
	return (double) percent / 100.0;
}

double getCarpetCharge(int area, double cost){
	return (double) area * cost;
}

double getLaborCharge(int area){
	return (double) area * LABOR_COST;
}
double getDiscount(int discount, double price){
	return convToPercent(discount) * price;
}

double getTotalAmt(double amt1, double amt2){
	return amt1 + amt2;
}

double getTax(double num1){
	return num1 * TAX_RATE;
}