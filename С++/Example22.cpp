#include <iostream>
#include <string.h>

using namespace std;

// Simple class with two fields
class Person {
	public:
		int id;
		char * name;
};

int main() {
	Person p;
	p.name = "Jonh";
	p.id = 1;
	// John 1
	cout << p.name << " " << p.id << endl;
}
