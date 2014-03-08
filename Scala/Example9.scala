object Example9 extends App {
    var a : Int = 6
    var b : Double = a + 0.5
    // Type casting
    var c : Long = b.asInstanceOf[Long]

    println(a) // = 6
    println(b) // = 6.5
    println(c) // = 6
}