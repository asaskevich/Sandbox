using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example27
{
    static void Main(string[] args)
    {
        Test.Print();
    }
}


class Test
{
    static int k = 27;
    // Private constructor
    // We can't create instance of class
    private Test() { }

    public static void Print() { Console.WriteLine(k); }
}