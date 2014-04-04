using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example31
{
    static void Main(string[] args)
    {
        Nested n = new Nested();
    }

    // Nested class
    class Nested {
        public Nested() { Console.WriteLine("Nested class is created");  }
    }
}

class Test {
    // It's raise CompiltationError
    //Nested n;
    //Example31.Nested n;
}