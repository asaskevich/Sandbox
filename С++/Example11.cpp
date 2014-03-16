#include <iostream>

using namespace std;

// Simple resursion
int recursion(int k) {
	if (k < 0) return 1;
	return (recursion(k - 1) ^ k) | (~k & (k >> 1));
}

int main() {
	// Call recursive function
	cout << recursion(10) << endl; // return 13
	cout << recursion(1242) << endl; // return 1829
	cout << recursion(10000) << endl; // return 14574
	return 0;
}
