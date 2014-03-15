using System;

class Example18
{
    static void Main()
    {
        Class_1 cl_1 = new Class_1();
        Class_2 cl_2 = new Class_2();
        // Call method from base class and from child class
        cl_1.sayHi();
        cl_2.sayHi();
    }
}

// Our basic class Class_1
public class Class_1
{
    public virtual void sayHi()
    {
        Console.WriteLine("Hi, I am Class_1");
    }
}

public class Class_2 : Class_1
{
    // "new" works like override
    public new void sayHi()
    {
        Console.WriteLine("Hi, I am Class_2");
    }
}
