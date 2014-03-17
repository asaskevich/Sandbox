using System;

class Example19 {
	static void Main() {
		// Array of Person, can contain all classes, that inherite Person
		Person[] peoples = {new Man(), new Woman()};
		foreach (Person p in peoples)
			Console.WriteLine(p.GetName());
	}
}

// Abstrct class Person
public abstract class  Person{
	// It's method doesn't require implementation inside abstract class
	public abstract string GetName();
}

public class Man : Person {
	// But in inherited class implementation must be
	public override string GetName(){
		return "Man";
	}
}

public class Woman : Person {
	public override string GetName(){
		return "Woman";
	}
}