import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    var aResult = IntArray(0)
    for (i in 0..1000) {
        if (a * i.toDouble().pow(3) + b * i.toDouble().pow(2) + c * i + d == 0.0) {
            aResult += i
        }
    }
    for (r in aResult) {
        println(r)
    }
}