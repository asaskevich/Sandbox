using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example28
{
    static void Main(string[] args)
    {
        Test.Print();
    }
}


class Test
{
    static int k = 0;
    // Static constructor, called when class first time loaded
    // We can't create instance of class
    static Test()
    {
        k = 28;
    }

    public static void Print() { Console.WriteLine(k); }
}