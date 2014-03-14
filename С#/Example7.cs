using System;

class Example7 {
	static void Main() {
		int[] arr_1 = {1, 2, 3, 4, 5};
		int[,] arr_2 = {{1, 2}, {3, 4}};

		// Now we can iterate through elements in one-dimensional array
		foreach (int elem in arr_1)
			Console.Write("{0}, ", elem);
		Console.WriteLine("\n");

		// We can iterate through elements in two-dimensional array
		foreach (int elem in arr_2)
			Console.Write("{0}, ", elem);
		Console.WriteLine("\n");
	}
}