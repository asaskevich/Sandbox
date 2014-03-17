#include <iostream>
#include <string.h>

using namespace std;

class Person {
	public:
		int id;
		// It's just declaration of function
		int getId();
};

// But here is implementation
int Person::getId() {
	return Person::id;
}

int main() {
	Person p;
	p.id = 124;
	cout << p.getId() << endl;
}
