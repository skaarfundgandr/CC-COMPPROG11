#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int sumPositives = 0, sumNegatives = 0, negatives = 0, positives = 0;
	float positiveAverage, negativeAverage;
	float* values;

	if (argc > 1)
	{
		values = (float*) malloc(sizeof(float) * (atoi(argv[1])));
		for (int i = 0, j = 2; i < (atoi(argv[1])); ++i){
			values[i] = atof(argv[j]);
			++j;
		}
		for (int i = 0; i < (atoi(argv[1])); ++i){
			if(values[i] >= 0.0){
				sumPositives += values[i];
				++positives;
			}
			else if (values[i] < 0.0){
				sumNegatives += values[i];
				++negatives;
			}
			else{
				printf("Invalid values!\n");
				abort();
			}
		}
		positiveAverage = (float) sumPositives / (float) (positives);
		negativeAverage = (float) sumNegatives / (float) (negatives);
		printf("sum of positives is %d\n", sumPositives);
		printf("sum of negatives is %d\n", sumNegatives);
		printf("average of positives is %.2f\n", positiveAverage);
		printf("average of negatives is %.2f\n", negativeAverage);
		values = NULL;
	}
	else{
		printf("Enter the values in the command line!\n");
		exit(1);
	}
	return 0;
}