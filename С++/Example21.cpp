#include <iostream>
#include <string.h>

using namespace std;

int main() {
	// Create pointer to int array
	int * arr = new int[10];

	// Putting values to arrays
	for (int i = 0; i < 10; i++)
		*(arr + i) = i;
	// Print values
	for (int i = 0; i < 10; i++)
		cout << *(arr + i) << " ";
}
