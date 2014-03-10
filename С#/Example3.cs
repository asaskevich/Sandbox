using System;

class Example3
{
	// Simple ariphmetic operators
	static void Main() {
		int a = 7;
		int b = 8;
		int c = 9;
		int x = a * b; 		  // = 56
		int y = a % b; 		  // = 7
		int z = b / c - x;    // = -56
		Console.WriteLine(z); // Is it -56 ?
	}
}