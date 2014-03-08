object Example6 extends App {
    // Partial function call
    def fun1(x : Int, y : Int) = x * y * 10
    val fun2 = fun1(5, _ : Int)
    val fun3 = fun1(_ : Int, 5)

    // Output should be 250 three times
    println(fun1(5, 5))
    println(fun2(5))
    println(fun3(5))
}