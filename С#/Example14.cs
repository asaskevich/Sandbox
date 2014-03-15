using System;

class Example14
{
    static void Main()
    {
        // Create new instance of structure
        // It's like previous example, but here we can use structure without constructor
        Person alex = new Person(18, "Alex");
        Person p;
        p.age = 20;
        p.name = "John";
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