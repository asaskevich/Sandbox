using System;

class Example15
{
    static void Main()
    {
        Person person = new Person(25, "Helen");
        Man john = new Man(26, "John");
        Person man = john;

        Console.WriteLine("John is {0} years old", john.age);
        // It's will raise Compile Error
        // Console.WriteLine("John is {0}", man.gender);
        // But this work
        Console.WriteLine("John is {0}", john.gender);
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
}

// Man derives Person
public class Man : Person
{
    public string gender = "Man";

    // Call base constructor for it
    public Man(int age, string name) : base(age, name){}
}