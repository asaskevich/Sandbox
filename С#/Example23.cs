using System;

class Example23 {
	static void Main() {
		// Create new instance of Class
		Class c = new Class();
		// Access to it propertyes
		Console.WriteLine(c.Square); // = 0
		c.Square = 12;
		Console.WriteLine(c.Square); // = 144
	}
}

public class Class {
	// It's a field
	private int sq = 0;

	// And it's a property
	public int Square {
		// It's return value of property
		get {
			return sq;
		}
		// It's set value of property
		set {
			sq = value * value;
		}
	}
}