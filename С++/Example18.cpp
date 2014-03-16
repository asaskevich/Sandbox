#include <iostream>
#include <string.h>

using namespace std;

int main() {
	cout.setf(ios::hex, ios::basefield);  // Set hex as the basefield
	cout.setf(ios::showbase);

	// We assign variable "i"
	int i = 0x123;
	cout << "Before: " << i << endl;
	// Now, using pointers, we changing value of "i"
	int * p = &i;
	*p = 0x321;
	cout << "After: " << i << endl;
}
