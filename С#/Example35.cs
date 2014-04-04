using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example35
{
    static void Main(string[] args)
    {
        Console.WriteLine(Days.Friday);
        Console.WriteLine(Bools.True);
        Console.WriteLine(Months.Apr);
    }
}

// int enumerator
enum Days { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday };
// Also int enumerator
enum Bools : int { True, False };
// byte enumerator
enum Months : byte { Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec };