using System;

class Example24
{
    static void Main()
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        // Call the extension method
        var sum = arr.Sum(4);
        Console.WriteLine("Remainder of sum in array is {0}", sum);
    }
}

// Class must be static
public static class ArrExtension
{
    // And extension method must be static
    public static int Sum(this int[] arr, int mod)
    {
        var ans = 0;
        foreach (var n in arr)
        {
            ans += n;
        }
        return ans % mod;
    }
}