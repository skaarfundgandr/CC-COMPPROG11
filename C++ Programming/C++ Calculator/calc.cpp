#include <iostream>
using namespace std;

int main()
{
	int nums1, nums2, result, instances;
	char operation;
	cout << "Input the number of instances" << endl;
	cin >> instances;
	for (int i = 1; i < instances; i++) {
		cout << "input an operation" << endl;
		cin >> operation;
		switch (operation) {
			case ('+'):
				cout << "Input two numbers" << endl;
				cin >> nums1 >> nums2;
				result = nums1 + nums2;
				cout << "The sum is " << result << endl;
				break;
			case ('-'):
				cout << "Input two numbers" << endl;
				cin >> nums1 >> nums2;
				result = nums1 - nums2;
				cout << "The difference is " << result << endl;
				break;
			case ('*'):
				cout << "Input two numbers" << endl;
				cin >> nums1 >> nums2;
				result = nums1 * nums2;
				cout << "The product is " << result << endl;
				break;
			case ('/'):
				cout << "Input two numbers" << endl;
				cin >> nums1 >> nums2;
				result = nums1 / nums2;
				cout << "The quotient is " << result << endl;
				break;
			default:
				break;
		}
	}
	return 0;
}