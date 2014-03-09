// Include all classes and objects from package 'scala.math'
import math._

// What about big integers ?
object Example17 extends App {
    var a : BigInt = 2
    var b : BigInt = a.pow(1024)
    print(b)
}