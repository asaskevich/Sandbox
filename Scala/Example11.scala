object Example11 extends App {
    // Variable number of parameters
    def fun(x : Int*) : Int = {
        var ans = 0
        for (next <- x) {
            ans += next
        }
        return ans
    }

    println(fun()) // 0
    println(fun(1)) // 1
    println(fun(1, 2)) // 3
    println(fun(1, 2, 3)) // 6
    println(fun(1, 2, 3, 4)) // 10
}