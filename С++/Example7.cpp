#include <iostream>

using namespace std;

int main() {
	int i = 0;
	int j = 10;
	// Simple while-loop, first check, then do statements
	while (i < 10) {
		cout << i << endl;
		i++;
	}
	i = 0;
	// Another while
	while (i < j || j > 0) {
		cout << i << ", " << j << endl;
		i++;
		j--;
	}

	j = 10;
	do {
		cout << j << endl;
		j --;
	} while (j < 0);
	// ^ This condition is false, but this loop will be executed once
	return 0;
}
