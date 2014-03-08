object Example4 extends App {
    // Function definition
    // Those examples are equivalent
    def sum(a : Int, b : Int) : Int = a + b
    def summa(a : Int, b : Int) = a + b

    println(sum(3, 4))
    println(summa(3, 4))
}