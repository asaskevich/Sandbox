using System;

class Example16
{
    static void Main()
    {
        Person person = new Person(25, "Helen");
        Man john = new Man(26, "John");
        Woman kate = new Woman(24, "Kate");

        // Now we call methods for any instance
        person.sayHi();
        john.sayHi();
        kate.sayHi();
    }
}

// Our basic class Person
public class Person
{
    public int age;
    public string name;

    public Person(int age, string name)
    {
        this.age = age;
        this.name = name;
    }

    public void sayHi()
    {
        Console.WriteLine("Hi, I am {0}", this.name);
    }
}

// Man derives Person
public class Man : Person
{
    // Call base constructor for it
    public Man(int age, string name) : base(age, name) { }
    // It's override Person.sayHi, but raise Compile Warning
    public void sayHi()
    {
        Console.WriteLine("Hi, I am {0} and I am man", this.name);
    }
}

// Woman derives Person
public class Woman : Person
{
    // Call base constructor for it
    public Woman(int age, string name) : base(age, name) { }
    public void sayHi()
    {
        Console.WriteLine("Hi, I am {0} and I am woman", this.name);
    }
}