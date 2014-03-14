using System;

class Example5 {
	static void Main() {
		int[] arr_1 = new int[5]; // Create array with 5 elements
		int[] arr_2 = {1, 2, 3, 4, 5}; // Pre-initialized array
		int[,] arr_3 = new int[3, 3]; // Matrix 3x3
		int[,,] arr_4 = new int[3, 3, 3]; // 3d matrix 3x3x3
		int[,] arr_5 = {{1, 2}, {3, 4}}; // 2x2 array
		
		arr_3[0, 0] = 3;
		arr_4[0, 0, 0] = 4;
		Console.WriteLine("The array has {0} dimensions.", arr_4.Rank); // Rank of arr_4
	}
}