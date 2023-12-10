#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

//Complete the following function.

int marks_summation(int* marks, int number_of_students, char gender){
    int boys[number_of_students], girls[number_of_students], sum = 0, belem = 0, gelem = 0;
  
    for (int i = 0; i < number_of_students; ++i){
        if (i % 2 == 0) {
            boys[belem] = marks[i];
            ++belem;
        }
        else{
            girls[gelem] = marks[i];
            ++gelem;
        }
    }
    if (gender == 'b'){
        for (int h = 0; h < belem; ++h){
            sum += boys[h];
        }
    }
    else if (gender == 'g'){
        for (int l = 0; l < gelem; ++l){
            sum += girls[l];
        }
    }
    else{
        printf("Invalid input!");
    }
    return sum;
}

int main(){
    int number_of_students;
    char gender;
    int sum;
  
    scanf("%d", &number_of_students);
    int *marks = (int *) malloc(number_of_students * sizeof (int));
 
    for (int student = 0; student < number_of_students; student++){
        scanf("%d", (marks + student));
    }
    
    scanf(" %c", &gender);
    sum = marks_summation(marks, number_of_students, gender);
    printf("%d", sum);
    free(marks);
 
    return 0;
}