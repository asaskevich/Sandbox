object Example12 extends App {
    // We can create instance of class
    val s = new Summator
    // Also we can access to it's functions
    s.print
    s.setA(6)
    s.setB(7)
    s.print
    println(s.sum) // = 13
}

// Class Summator
class Summator {
    // fields of class
    var a = 0
    var b = 0

    // Functions of class
    // NOTE: we can concat strings with 
    def print = println("a=" + a + " b=" + b)
    def setA(x : Int) = { a = x }
    def setB(x : Int) = { b = x }
    def sum = a + b
}