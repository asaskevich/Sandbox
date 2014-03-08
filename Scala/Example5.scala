object Example5 extends App {
    // Anonymous functions
    val fun = (x : Double) => x * 2 + 3 * x
    val fun2 = (x : Double, y : Double) => x / y + x * y

    println(fun(5))
    println(fun2(5, 6))
}