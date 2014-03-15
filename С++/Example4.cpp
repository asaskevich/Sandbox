#include <iostream>

using namespace std;

int main() {
	int a = 123;
	int b = 372;

	// Binary arithmetic
	int d = a & b;
	int e = a | b;
	int f = a ^ b;
	int g = ~a;
	int h = !a;

	cout << d << endl; // = 112
	cout << e << endl; // = 383
	cout << f << endl; // = 271
	cout << g << endl; // -124
	cout << h << endl; // = 0

	return 0;
}
