object Example18 extends App {
    // It's simple to print numbers from 0 to 10
    for (i <- 0 to 10)
        println(i)
    // And so simple to print from 10 to 0
    for (i <- 10.to(0, -1))
        println(i)
}