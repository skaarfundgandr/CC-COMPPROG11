#include <stdio.h>
#include <stdlib.h>

typedef struct node{
	int data;
	struct node* left;
	struct node* right;
} node_t;

node_t* addNode(int data);
node_t* createTree(node_t* tree, int data);
void printData(node_t* tree);

int main(int argc, char const *argv[]){
	int data, n;
	int* nums;
	node_t* root = NULL;

	printf("Enter the amount of numbers you want to add: ");
	scanf("%d", &n);

	nums = (int*) malloc(sizeof(int) * n);

	for (int i = 0; i < n; ++i) {
		printf("Enter element %d\n", i + 1);
		scanf("%d", nums + i);
	}
	for (int i = 0; i < n; ++i)
		root = createTree(root, *(nums + i));
	printData(root);
	printf("\n");
	
	return 0;
}

node_t* addNode(int data){
	node_t* newNode;

	newNode = (node_t*) malloc(sizeof(node_t));

	newNode->data = data;
	newNode->left = NULL;
	newNode->right = NULL;

	return newNode;
}

node_t* createTree(node_t* tree, int data){
	node_t* current = tree;

	if (current == NULL)
		current = addNode(data);
	if (data < current->data)
		current->left = createTree(current->left, data);
	if (data > current->data)
		current->right = createTree(current->right, data);

	return current;
}
// Preorder Traversal
void printData(node_t* root){
	if (root != NULL){
		printf("%d ", root->data);
		printData(root->left);
		printData(root->right);
	}
}
