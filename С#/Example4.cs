using System;

class Example4 
{
	static void Main()
	{
		var a = 213;
		var b = 145;
		Console.WriteLine(sum(a, b)); // = 358
	}

	// It's private and static function, that return sum of A and B
	// About modifiers we well talk later
	static int sum(int a, int b) {
		return a + b;
	}
}