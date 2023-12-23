#include <stdio.h>

int checkQuadrant(double angle);

int main()
{
	double angle;
	int quadrant;

	printf("Enter the value of the angle: \n");
	scanf("%lf", &angle);

	angle = (int) angle % 360;

	if (angle == 0.0)
		printf("The line is on the positive X-axis.\n");
	else if (angle == 90.0)
		printf("The line is on the positive Y-axis.\n");
	else if (angle == 180.0)
		printf("The line is on the negative X-axis.\n");
	else if (angle == 270.0)
		printf("The line is on the negative Y-axis.\n");
	else if (angle < 0)
		printf("Input must be positive!\n");
	else{
		quadrant = checkQuadrant(angle);
		printf("The line is on quadrant %d\n.", quadrant);
	}

	return 0;
}

int checkQuadrant(double angle){
	if (0.0 < angle && angle < 90.0)
		return 1;
	else if (90.0 < angle && angle < 180.0)
		return 2;
	else if (180.0 < angle && angle < 270.0)
		return 3;
	else if (270.0 < angle && angle < 360.0)
		return 4;
	else 
		return 0;
}