using System;

class Example21 {
	static void Main() {
		// Access to constants
		Console.WriteLine(Const.one);
		Console.WriteLine(Const.two);
	}
}

// Class contains only constants
static class Const {
	public const int one = 1;
	public const int two = 2;
}