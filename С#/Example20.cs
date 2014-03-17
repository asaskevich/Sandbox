using System;

class Example20 {
	static void Main() {
		// Call static metho
		MathHlper.PrintStr("Hello, static class");
		// Get static field
		MathHlper.PrintStr(MathHlper.PI + "");
		// Get static function
		MathHlper.PrintStr(MathHlper.Square(12) + "");
	}
}

// We can't create instances of static class
// But xan access to it without any reference
public static class MathHlper {
	public static double PI = 3.14;

	public static void PrintStr(string s){
		Console.WriteLine(s);
	}

	public static int Square(int k){
		return k * k;
	}
}