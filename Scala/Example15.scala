object Example15 extends App {
    var a = new Test
    var b = new Test with ExtendedTest
    a.print // this instance of Test doesn't contains function extPrint
    b.extPrint // but this contains
}

class Test {
    def print = println("OK")
}

// Trait, that extends Test with function extPrint
trait ExtendedTest extends Test {
    def extPrint = {
        super.print
        println("!")
    }
}

