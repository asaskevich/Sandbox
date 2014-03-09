object Example20 extends App {
    // Recursive function
    def pow(n : Int, k : Int) : Int =
        {
            if (k == 0) 1
            else if (k % 2 == 0) {
                var y = pow(n, k / 2)
                y * y
            } else n * pow(n, k - 1)
        }

    print(pow(2, 10)) // Is it = 1024?
}