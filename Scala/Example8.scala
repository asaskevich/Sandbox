object Example8 extends App {
    // Local anonymous functions
    def fun(x : Int) : Int = {
        val localFun = (v : Int) => v * v
        var y = x * 2
        return localFun(y)
    }

    // Also local function, but not anonymous
    def fun1(x : Int) : Int = {
            def cube(y : Int) = y * y * y
        return cube(x)
    }

    println(fun(4)) // Output will be 64
    println(fun1(2)) // Output will be 8
}