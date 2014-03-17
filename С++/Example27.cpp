#include <iostream>
#include <string.h>

using namespace std;

// class of Linked List
class List {
	public:
		// It's store value and pointer to next element
		int getValue();
		void setValue(int v);
		List * next;
	private:
		// This fields and function visible only inside class
		int value;
};

List * list;

int List::getValue() {
	return value;
}

void List::setValue(int v) {
	value = v;
}

// Add new element to head of list
void add(int val) {
	List * l = new List();
	// l->value = val;
	l->setValue(val);
	l->next = list;
	list = l;
}

// Print list
void print(List * l) {
	cout << l->getValue() << ", ";
	if (l->next != NULL) print(l->next);
}

int main() {
	add(1);	// 1
	add(2);	// 2 -> 1
	add(3);	// 3 -> 2 -> 1
	add(4);	// 4 -> 3 -> 2 -> 1
	add(5);	// 5 -> 4 -> 3 -> 2 -> 1
	add(6);	// 6 -> 5 -> 4 -> 3 -> 2 -> 1
	add(7);	// 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1
	print(list);
}
