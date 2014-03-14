using System;

class Example10 {
	static void Main() {
		// It's possible to create implicitly-typed array
		var arr_1 = new[] {1, 2, 3, 4, 5}; // int[]
		var arr_2 = new[] {"a", null, "b"}; // string[]

		// >>> 1, 2, 3, 4,
		foreach (int elem in arr_1)
			Console.Write("{0}, ", elem);
		Console.WriteLine("\n");

		// >>> a, , b,
		foreach (string elem in arr_2)
			Console.Write("{0}, ", elem);
		Console.WriteLine("\n");
	}
}