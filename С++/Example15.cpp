#include <iostream>

using namespace std;

// Function retrieve array and return sum of elements
int sum(int arr[], int len) {
	int ans = 0;
	for (int i = 0; i < len; i++)
		ans += arr[i];
	return ans;
}
int main() {
	// Array contain numbers from 1 to 5
	int arr[] = { 1, 2, 3, 4, 5 };
	cout << sum(arr, 5) << endl;
}
