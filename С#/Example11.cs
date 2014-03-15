using System;

class Example11
{
    static void Main()
    {
        // Create new instance of Class
        Class cl = new Class();
        // Now we can access to instance
        cl.k = 10;
    }
}

// Our class Class
public class Class {
    public int k = 0;
}