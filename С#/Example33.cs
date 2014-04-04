using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Example33
{
    static void Main(string[] args)
    {
        Dictionary<int, string> dict = new Dictionary<int, string>() { { 1, "a" }, { 2, "b" }, { 3, "c" }, { 4, "d" }, { 5, "e" } };
        // Result has anonymous type 
        var result = from d in dict where d.Key % 2 == 0 select new { d.Value, d.Key };
        foreach (var obj in result)
        {
            Console.WriteLine(obj.Value + " " + obj.Key);
        }
    }
}