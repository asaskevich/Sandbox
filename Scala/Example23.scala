object Example23 extends App {
    var arr = Array(2, 1, 4, 5, 6, 3, 6, 7, 3, 2, 4, 7)
    // So simple to get sum of array
    var sum = arr.sum
    // And min value
    var min = arr.min
    // And maximum value
    var max = arr.max
    println(arr.mkString(", "))
    println(sum)
    println(max)
    println(min)
}