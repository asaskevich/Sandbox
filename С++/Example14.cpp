#include <iostream>

using namespace std;

int main() {
	// First array of int (WARNING: this array contain stuff)
	int arr_1[5];
	// Second array, contain numbers from 1 to 5
	int arr_2[] = { 1, 2, 3, 4, 5 };

	for (int i = 0; i < 5; i++)
		cout << arr_1[i] << " ";
	cout << endl;

	for (int i = 0; i < 5; i++)
		cout << arr_2[i] << " ";
	cout << endl;
}
