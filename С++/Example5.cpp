#include <iostream>

using namespace std;

int main() {
	bool a = false;
	bool b = true;

	// Logical arithmetic
	bool d = a && b;
	bool e = a || b;
	bool f = a ^ b;
	bool g = ~a;
	bool h = !a;

	// 0 if variable false
	// 1 otherwise
	cout << d << endl; // = 0
	cout << e << endl; // = 1
	cout << f << endl; // = 1
	cout << g << endl; // = 1
	cout << h << endl; // = 1

	return 0;
}
