object Example7 extends App {
    //Function as parameter
    def two(x : Int) = x * 2
    def three(x : Int) = x * 3

    def fun(x : Int, f : (Int) => Int) = f(x)

    println(fun(4, two)) // >> 8
    println(fun(4, three)) // >> 12
}