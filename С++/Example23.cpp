#include <iostream>
#include <string.h>

using namespace std;

// Simple class with three fields and one function
class Person {
	public:
		int id;
		char * name;
		int age;
		void setAge(int k) {
			age = k;
		}
		int getAge() {
			return age;
		}
};

int main() {
	Person p;
	// After creating, fields store stuff inside
	cout << p.age << " " << p.getAge() << endl;
	// Call function of class
	p.setAge(25);
	cout << p.age << " " << p.getAge() << endl;
}
