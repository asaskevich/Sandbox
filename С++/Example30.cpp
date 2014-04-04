#include <iostream>
#include <string.h>
#include <stdlib.h>

using namespace std;

class Test {
	public:
		// Static fields are same for any instance
		static int k;
};

int Test::k = 0;
Test s1;
Test s2;

int main() {
	cout << s1.k << " " << s2.k << endl;
	s1.k++;
	cout << s1.k << " " << s2.k << endl;
	s2.k++;
	cout << s1.k << " " << s2.k << endl;
	return 0;
}
