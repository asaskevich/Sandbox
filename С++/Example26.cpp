#include <iostream>
#include <string.h>

using namespace std;

// class of Linked List
class List {
		// It's store value and pointer to next element
	public:
		int value;
		List * next;
};

List * list;

// Add new element to head of list
void add(int val) {
	List * l = new List();
	l->value = val;
	l->next = list;
	list = l;
}

// Print list
void print(List * l) {
	cout << l->value << ", ";
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
