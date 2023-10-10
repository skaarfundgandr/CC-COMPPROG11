#include <iostream>
using namespace std;

int fibonacci(int n){
	if (n == 0 | n == 1){
		return n;
	}
	return fibonacci(n-1) + fibonacci(n-2);
}

int main()
{
	int terms;
	cout << "Enter the number of terms: ";
	cin >> terms;

	for (int i = 0; i < sizeof(terms); i++){
		terms--;
		cout << fibonacci(terms+1) << endl;
	}
	return 0;
}