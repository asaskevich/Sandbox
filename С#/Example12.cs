using System;

class Example12
{
    static void Main()
    {
        // Create new instance of Class
        Class cl_1 = new Class(10);
        Class cl_2 = new Class(10);
        // Now we can access to instances
        // ...
    }
}

// Our class Class
public class Class
{
    public int k = 0;

    public Class(int k)
    {
        this.k = k;
    }
}