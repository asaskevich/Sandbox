using System;

class Example22 {
	static void Main() {
		// Create new instance of Fields
		Fields f = new Fields();
		// Access to it fields
		Console.WriteLine(f.i);
		Console.WriteLine(f.s);
	}
}

public class Fields {
	// I and S are fields
	public int i = 123;
	public string s = "Field #2";
}