#include <iostream>
#include <string.h>
#include <stdlib.h>

using namespace std;

int main() {
	// If it possible, variable will be stored in CPU registers
	register int n = 0;
	n++;
	cout << n << n + 1 << n * 2;
	return 0;
}
