object Example13 extends App {
    val comp = new Comparator(25, 24)
    println(comp.min) // min = 24
    println(comp.max) // max = 25
}

// Constructor usage
class Comparator(a : Int, b : Int) {
    val f1 = a
    val f2 = b

    val min = if (a < b) a else b
    val max = if (a < b) b else a
}