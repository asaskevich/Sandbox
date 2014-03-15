#include <iostream>

using namespace std;

int main() {
	// Simple for-loop, that write numbers from 0 to 4
	for (int i = 0; i < 5; i++)
		cout << i << endl;

	// For-loop with step 2
	for (int i = 0; i < 5; i += 2)
		cout << i << endl;

	// For-loop with complex conditions and steps
	for (int i = 0, j = 5; i < j || j > 0; i += 2, j --)
		cout << i << ", " << j << endl;

	return 0;
}
