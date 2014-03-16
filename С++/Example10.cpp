#include <iostream>

using namespace std;

// Function doesn't take arguments and doesn't return anything
void printHi(void) {
	cout << "Hello!" << endl;
}

// Function take char* argument and doesn't return anything
void printHi(char * name) {
	cout << "Hello, " << name << endl;
}

// Function take int argument and return int
int square(int k) {
	return k * k;
}

int main() {
	// Call printHi without arguments
	printHi();
	// Call printHi with "Alex" argument
	printHi("Alex");
	// Call function square, that return int
	cout << square(10) << endl;
	return 0;
}
