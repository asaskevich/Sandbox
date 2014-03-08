object Example14 extends App {
    val m1 = new Mul
    val m2 = new Mul2
    println(m1.ans(5)) // = 5
    println(m2.ans(5)) // = 10
}

class Mul {
    def ans(x : Int) = x * 1
}

// Inheritage class Mul
class Mul2 extends Mul {
    // Overrides method "ans" from class Mul
    override def ans(x : Int) = x * 2
}