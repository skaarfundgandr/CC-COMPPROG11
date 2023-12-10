#include <stdio.h>
#include <stdlib.h>
#ifdef _WIN32
#define CLEAR "cls"
#else
#define CLEAR "clear"
#endif

void Input_Data(int arr_1[], float arr_2[]);
void Diff_Sum(int arr_1[], float arr_2[], float arr_3[]);

int main(){
	int arr_1[4];
	float arr_2[4];
	float arr_3[4];

	Input_Data(arr_1, arr_2);
	Diff_Sum(arr_1, arr_2, arr_3);

	return 0;
}

void Input_Data(int arr_1[], float arr_2[]){
	printf("Input 5 integer numbers to be stored to arr_1:\n");
	scanf("%d %d %d %d %d", &arr_1[0], &arr_1[1], &arr_1[2], &arr_1[3], &arr_1[4]);
	printf("Input 5 floating point numbers to be stored to arr_2: \n");
	scanf("%f %f %f %f %f", &arr_2[0], &arr_2[1], &arr_2[2], &arr_2[3], &arr_2[4]);
}

void Diff_Sum(int arr_1[], float arr_2[], float arr_3[]){
	for (int i = 0; i < 5; ++i){
		for (int j = 5; j > i; --j){
			if (arr_1[i] > arr_2[j])
				arr_3[j] = (float) arr_1[i] - arr_2[j];
			else
				arr_3[i] = (float) arr_1[i] + arr_2[j];
		}
	}
	for (int i = 0; i < 5; ++i)
		printf("Element %d in arr_3 is:%f\n", i + 1, arr_3[i]);
}