#include <iostream>
#include <string.h>
#include <stdlib.h>

using namespace std;

void inc()
{
	// Local static variable store self value between function calls
	static int k;
	k ++;
	cout << k << endl;
}

int main() {
	inc();
	inc();
	inc();
	return 0;
}
