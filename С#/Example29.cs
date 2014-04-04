using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example29
{
    static void Main(string[] args)
    {
        Test t = new Test();
        t.Work();
    }
}


class Test
{
    public Test()
    {
        Console.WriteLine("Constructor called");
    }

    // Destructor - called, when instance is destroyed
    ~Test()
    {
        Console.WriteLine("Destructor called");
    }

    public void Work()
    {
        Console.WriteLine("Method called");
    }
}