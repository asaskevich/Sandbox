#include <iostream>

using namespace std;

int globalVar = 10;

int main() {
	int localVar = 11;
	static int staticVar = 12; // Static variable always save self state
	cout << globalVar << endl;
	cout << localVar << endl;
	cout << staticVar << endl;
	return 0;
}
