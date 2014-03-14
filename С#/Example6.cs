using System;

class Example6 {
	static void Main() {
		int[][] arr = new int[3][]; // Array of arrays
		arr[0] = new int[1]; // First array is array of one element
		arr[1] = new int[2]; // It's array with 2 elements
		arr[2] = new int[3];

		Console.WriteLine("arr has {0} arrays inside.", arr.Length);
	}
}