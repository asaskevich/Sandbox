#include <iostream>
#include <string.h>

using namespace std;

void swap(int * a, int * b) {
	int t = *a;
	*a = *b;
	*b = t;
}

int main() {
	cout.setf(ios::hex, ios::basefield);  // Set hex as the basefield
	cout.setf(ios::showbase);

	int l = 0x123;
	int r = 0x234;
	cout << "Before L: " << l;
	cout << " R: " << r << endl;
	// We can send pointers to function
	swap(&l, &r);
	cout << "After L: " << l;
	cout << " R: " << r << endl;
}
