using System;

class Example8 {

	// We can send array into function
	static int SumOfArray(int[] arr)
	{
		int Sum = 0;
		foreach (int el in arr)
			Sum += el;
		return Sum;
	}

	static void Main()
	{
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Pre-init array
		// Now we call SumOfArray with argument arr
		Console.WriteLine("Sum of array is {0}", SumOfArray(arr));
	}
}