object Example10 extends App {
    // Currying functions
    def summa(a : Int)(b : Int) = a + b

    val sumA = summa(5) _
    val sumAB = sumA(6)

    println(sumAB) // 11 is OK
}