using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example26
{
    static void Main(string[] args)
    {
        Test test = new Test(26);
        test.Print();
    }
}


class Test
{
    int k;
    // Simple constructor that take one argument
    public Test(int k)
    {
        this.k = k;
    }

    public void Print() { Console.WriteLine(k); }
}