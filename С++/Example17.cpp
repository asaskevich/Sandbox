#include <iostream>
#include <string.h>

using namespace std;

int main() {
	cout.setf(ios::hex, ios::basefield);  // Set hex as the basefield
	cout.setf(ios::showbase);

	int i = 100;
	long l = 120314;
	double d = 1.123;
	float f = 1.235;
	bool b = true;

	// Write addresses of variables
	cout << "Address for I: " << &i << endl;
	cout << "Address for L: " << &l << endl;
	cout << "Address for D: " << &d << endl;
	cout << "Address for F: " << &f << endl;
	cout << "Address for B: " << &b << endl;
}
