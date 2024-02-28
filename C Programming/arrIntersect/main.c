#include <stdio.h>
#include <stdlib.h>

void arrIntersect(int *arr1, int size1, int *arr2, int size2);

int main(int argc, char const *argv[]){
    int *arr1, *arr2, arr1Size, arr2Size;

    printf("Enter the size of array 1: ");
    scanf("%d", &arr1Size);
    printf("Enter the size of array 2: ");
    scanf("%d", &arr2Size);

    arr1 = (int *) malloc(sizeof(int) * arr1Size);
    arr2 = (int *) malloc(sizeof(int) * arr2Size);

    for (int i = 0; i < arr1Size; ++i) {
        printf("Enter element %d for array 1: ", i + 1);
        scanf("%d", &arr1[i]);
    }
    for (int i = 0; i < arr2Size; ++i) {
        printf("Enter element %d for array 2: ", i + 1);
        scanf("%d", &arr2[i]);
    }

    arrIntersect(arr1, arr1Size, arr2, arr2Size);

    return 0;
}

void arrIntersect(int *arr1, int size1, int *arr2,  int size2){
    int *intersect, intersectSize, elems = 0;

    if (size1 > size2) {
        intersectSize = size1;
    }
    else {
        intersectSize = size2;
    }

    intersect = (int *) malloc(sizeof(int) * intersectSize);

    for (int i = 0; i < size1; ++i) {
        for (int j = 0; j < size2; ++j) {
            if (arr2[j] == arr1[i]) {
                intersect[elems] = arr1[i];
                ++elems;
            }
        }
    }
    printf("Intersected values are: ");
    for (int i = 0; i < elems; ++i) {
        printf("%d ", intersect[i]);
    }
    printf("\n");
}
