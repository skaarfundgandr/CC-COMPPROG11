#include <stdio.h>
#include <stdlib.h>
#define DAYS_IN_A_WEEK 7

void validate_temp(double temp);
void HiLo_Temp(double temps[7], char *day[7]);

int main()
{
	char *days_week[DAYS_IN_A_WEEK] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	double day_temp[DAYS_IN_A_WEEK];

	for (int i = 0; i < DAYS_IN_A_WEEK; ++i){
		printf("Enter temperator for day %d:\n", i + 1);
		scanf("%lf", &day_temp[i]);
		validate_temp(day_temp[i]);
	}
	HiLo_Temp(day_temp, days_week);
	return 0;
}

void validate_temp(double temp){
	if (temp > 100.0){
		printf("Input should not be more than 100!\n");
		exit(1);
	}
	if (temp < -50.0){
		printf("Input should not be less than -50!\n");
		exit(1);
	}
}

void HiLo_Temp(double temps[7], char *days[7]){
	int i, j, day_min, day_max;
	double min = 100.0, max = 0.0;
	for (i = 0; i < DAYS_IN_A_WEEK; ++i){
		for (j = 0; j < 7; ++j){
			if (min > temps[j]){
				min = temps[j];
				day_min = j;
			}
			if (max < temps[j]){
				max = temps[j];
				day_max = j;
			}
		}
	}
	printf("%s has max temperature which is %.2lf\n", days[day_max], max);
	printf("%s has min temperature which us %.2lf\n", days[day_min], min);
}