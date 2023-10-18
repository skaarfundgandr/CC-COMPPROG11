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

	for (int i = 0; i < terms;){
		terms--;
		cout << fibonacci(terms) << endl;
	}
	return 0;
}