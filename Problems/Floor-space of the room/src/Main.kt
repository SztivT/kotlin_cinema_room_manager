import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    when (scanner.next()) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val s = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> println(scanner.nextDouble() * scanner.nextDouble())
        "circle" -> println(3.14 * scanner.nextDouble().pow(2))
    }
}