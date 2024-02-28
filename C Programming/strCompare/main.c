#include <stdio.h>
#include <stdbool.h>
#define MAX_SIZE 50

bool strCompare(char *origStr, char *compStr);

int main(int argc, char const *argv[]){
    char originalStr[MAX_SIZE];
    char comparedStr[MAX_SIZE];

    printf("Enter the original string: \n");
    scanf("%s", originalStr);
    printf("Enter string to be compared: \n");
    scanf("%s", comparedStr);

    if (strCompare(originalStr, comparedStr)){
        printf("The strings are equal\n");
    }
    else {
        printf("The strings are different\n");
    }

    return 0;
}

bool strCompare(char *originalStr, char *compStr){
    unsigned char *ptr1 = (unsigned char *) originalStr;
    unsigned char *ptr2 = (unsigned char *) compStr;

    while (*ptr1 != '\0') {
        if (*ptr2 == '\0')
            return false;
        if (*ptr2 > *ptr1)
            return false;
        if (*ptr2 < *ptr1)
            return false;

        ++ptr1;
        ++ptr2;
    }
    if (*ptr2 != '\0')
        return false;

    return true;
}
