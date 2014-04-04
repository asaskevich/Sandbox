using System;

class Example25
{
    static void Main()
    {
        // Here boolean and string arguments will use default value
        test(2);
        // Here string argument will use default value
        test(5, false);
        test(7, false, "str");
        // We can set manually named arguments
        test(i: 10, s: "my string", b: false);
    }

    static void test(int i, bool b = true, string s = "String")
    {
        Console.WriteLine("Int is {0}, boolean is {1}, string is {2}", i, b, s);
    }
}