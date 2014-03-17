#include <iostream>
#include <string.h>

using namespace std;

class Person {
	public:
		int id;
		// It's just declaration of function
		int getId();
};

int getId() {
	return -1;
}

// But here is implementation
int Person::getId() {
	// Call external function with identical name
	return ::getId();
	//return Person::id;
}

int main() {
	Person p;
	p.id = 124;
	// p.id = 124, but it will write -1
	cout << p.getId() << endl;
}
