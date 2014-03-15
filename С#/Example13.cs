using System;

class Example13
{
    static void Main()
    {
        // Create new instance of structure
        Person alex = new Person(18, "Alex");
        Person p = new Person();
        // Print values
        Console.WriteLine("alex.name = {0}, alex.age = {1}", alex.name, alex.age);
        Console.WriteLine("p.name = {0}, p.age = {1}", p.name, p.age);
    }
}

// Our structure Person
public struct Person
{
    // We can't pre-initialize variables
    public int age;
    public string name;

    public Person(int age, string name)
    {
        this.age = age;
        this.name = name;
    }
}