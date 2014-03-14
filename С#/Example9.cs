using System;

class Example9 {
	// Here we reassigment arr
	static void outFun(out int[] arr)
	{
		arr = new int[4]{1, 2, 3, 4};
	}

	// Here we can edit sended array or create new
	static void refFun(ref int[] arr)
	{
		if (arr == null)
			arr = new int[5];
		arr[0] = 10;
	}

	static void Main() {
		int[] arr_1;
		outFun(out arr_1);

		int[] arr_2 = {1, 2, 2, 2, 5};
		refFun(ref arr_2);


		// >>> 1, 2, 3, 4
		foreach (int elem in arr_1)
			Console.Write("{0}, ", elem);
		Console.WriteLine("\n");

		// >>> 10, 2, 2, 2, 5
		foreach (int elem in arr_2)
			Console.Write("{0}, ", elem);
		Console.WriteLine("\n");
	}
}