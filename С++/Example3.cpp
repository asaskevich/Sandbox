#include <iostream>

using namespace std;

int main() {
	int a = 10;
	int b = 20;
	int c = 30;

	// Arithmetic operators
	int d = a / b + b * c - a % c;
	// Just print 590
	cout << d << endl;
	d = -d;
	// Now d = -590
	cout << d << endl;
	d ++; // Store then increment
	++ d; // Increment then store
	// Now d = -588
	cout << d << endl;

	return 0;
}
