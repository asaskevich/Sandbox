#include <iostream>
#include <string.h>

using namespace std;

int * get(int val) {
	// Create new pointer to variable in heap
	int * p = new int;
	*p = val;
	return p;
}

int main() {
	cout.setf(ios::hex, ios::basefield);  // Set hex as the basefield
	cout.setf(ios::showbase);
	// Function can return pointer
	int * p = get(0x123);
	cout << *p;
	int * ps = get(0x462);
	cout << *ps;
}
