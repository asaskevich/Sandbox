#include <iostream>
#include <string.h>
#include <stdlib.h>

using namespace std;

// class of Linked List
class Person {
	public:
		char * name;
		// Constructor of class
		Person(char * id) {
			cout << "Create Person with name " << id << " len = " << strlen(id) << endl;
			name = (char *) malloc((strlen(id) + 1) * sizeof(char));
			name = strcpy(name, id);
		}

		// And it's destructor
		~Person() {
			cout << "Destroy Person with name " << name << " len = " << strlen(name) << endl;
			free(name);
		}
};

int main() {
	Person * p = new Person("John");
	cout << p->name << endl;
	p->~Person();
	cout << p->name << endl;
	return 0;
}
