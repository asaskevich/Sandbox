using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example32
{
    static void Main(string[] args)
    {
        Test.M1();
        Test.M2();
    }
}

// Partial class
// We can split class between some files
partial class Test { 
    public static void M1() {Console.WriteLine("M1"); }
}

partial class Test
{
    public static void M2() { Console.WriteLine("M2"); }
}