using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example34
{
    static void Main(string[] args)
    {
        Work("Hi", Console.WriteLine);
        Work("Hi", Console.Write);
    }

    // Delegate. Some method that return void and take string
    public delegate void Print(string s);

    // Instead p we can pass some method with signature (string)void
    public static void Work(string s, Print p)
    {
        p(s);
    }
}