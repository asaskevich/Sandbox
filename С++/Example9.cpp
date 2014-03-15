#include <iostream>

using namespace std;

int main() {
	int k = 1;
	// Simple switch
	// Instead K can be bool, int or char types
	switch (k) {
		case 0:
			cout << "zero" << endl;
			break;
		case 1:
			cout << "one" << endl;
			break;
		case 2:
			cout << "two" << endl;
			break;
		default:
			cout << "What is it?" << endl;
	}

	return 0;
}
