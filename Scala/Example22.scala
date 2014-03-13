object Example22 extends App {
    // Initialized array
    var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // Multiply every element by two
    arr = for (el <- arr) yield el * 2
    // Print array, as in previous example
    print(arr.mkString(", "))
}