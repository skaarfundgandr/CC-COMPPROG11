#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_SIZE 128

typedef struct book {
    char author[MAX_SIZE];
    char isbn[MAX_SIZE];
    char title[MAX_SIZE];
    bool isBorrowed;
    struct book *next;
} book_t;

void displayBooks(book_t* list);
book_t* appendBook(book_t** list, char *title, char *author, char *isbn);
bool isValid(char *isbn);
bool checkAvailable(char *isbn, book_t* bookList);

int main(int argc, char const *argv[]){
    book_t *bookList = NULL;
    book_t b1;
    int choice, c, attempts = 0, isbnAttempts = 0;
    char isbn[MAX_SIZE], title[MAX_SIZE], author[MAX_SIZE];
    do{
        printf("1: Add book\t2: Borrow book\t3: Return Book\t4: Display book\t5: Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        while ((c = getchar()) != '\n' && c != EOF) {}
        switch (choice) {
            case 1:
                printf("Enter title:\n");
                scanf("%[^\n]%*c", title);
                printf("Enter author:\n");
                scanf("%[^\n]%*c", author);
                do{
                    printf("Enter ISBN:\n");
                    scanf("%s", isbn);
                    if (isValid(isbn) == false) {
                        printf("Invalid ISBN! Please enter it again\n");
                        printf("Attempt %d of 5\n", ++isbnAttempts);
                        ++isbnAttempts;
                    }
                }while (!(isValid(isbn)) && isbnAttempts <= 5);
                bookList = appendBook(&bookList, title, author, isbn);
                break;
            // TODO
            case 2:
                printf("Enter ISBN:\n");
                scanf("%s", isbn);
                // if (b1.isBorrowed) {
                //     printf("Book is currently unavailable!\n");
                // }
                // else{
                //     b1.isBorrowed = true;
                // }
                break;
            // TODO
            case 3:
                printf("Enter ISBN:\n");
                scanf("%s", isbn);
                if (b1.isBorrowed) {
                    printf("Thank you for returning the book\n");
                    b1.isBorrowed = false;
                }
                else{
                    printf("Book is currently available. Are you sure you entered the correct ISBN?\n");
                }
                break;
            case 4:
                displayBooks(bookList);
                break;
            case 5:
                exit(0);
                break;
            default:
                printf("Invalid choice!\n");
                printf("Attempt %d of 5\n", ++attempts);
                ++attempts;
                break;
        }
        if (attempts == 5) {
            printf("Reached maximum number of attempts!\nProgram exiting...\n");
            exit(1);
        }
    } while (choice != 5 && attempts <= 5);
    return 0;
}

book_t* appendBook(book_t** list, char *title, char *author, char *isbn){
    book_t* current = *list;
    book_t* newBook;

    newBook = malloc(sizeof(book_t));

    strcpy(newBook->title, title);
    strcpy(newBook->author, author);
    strcpy(newBook->isbn, isbn);
    newBook->isBorrowed = false;
    newBook->next = NULL;

    if (current == NULL) {
        current = newBook;
    }
    else {
        while (current->next != NULL) {
            current = current->next;
        }
        current->next = newBook;
    }
    return current;
}

void displayBooks(book_t* list){
    book_t *current = list;

    while (current != NULL) {
        printf("Title: %s\n", current->title);
        printf("Author: %s\n", current->author);
        printf("ISBN: %s\n", current->isbn);
        printf("Borrowed: %s\n", current->isBorrowed ? "Yes": "No");
        current = current->next;
    }
}

bool isValid(char *isbn){
    unsigned char *pchar = (unsigned char *) isbn;
    int sum = 0, elems = 10;
    for (int i = 0; *pchar != '\0'; ++i) {
        if (i == 9 && toupper(*pchar) == 'X') {
            sum += (10 * elems);
        }
        else {
            sum += ((*pchar - 0x30) * elems);
            --elems;
        }
        ++pchar;
    }
     if (sum % 11 == 0){
         return true;
     }
     else{
        return false;
     }
}

bool checkAvailable(char *isbn, book_t* bookList){
    book_t* current = bookList;

    while (current != NULL){
        if (strcmp(isbn, current->isbn) == 0 && current->isBorrowed == false)
            return true;
        current = current->next;
    }
    return false;
}
