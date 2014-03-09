object Example19 extends App {
    val str = "Long long string"
    // Instead str.charAt(i) we can use str(i), it's equivalent
    for (i <- 0 until str.length())
        print(str(i))
}