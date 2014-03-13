object Example21 extends App {
    // New array of Integer with 10 elements 
    var arr = new Array[Int](10)
    // a[i] = i
    for (i <- 0 until 10)
        arr(i) = i
       
    // Print array with delimiter
    print(arr.mkString(", "))
}
