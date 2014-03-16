#include <iostream>
#include <string.h>

using namespace std;

int main() {
	// Simple strings
	char str_1[] = "Hello";
	char delim[] = ", ";
	char str_2[] = "world";

	// Now we can concat them
	strcat(str_1, delim); // "Hello" + ", "
	strcat(str_1, str_2); // "Hello, " + "world"
	cout << str_1 << endl;
	// And write length
	cout << "Length: " << strlen(str_1) << endl;
}
