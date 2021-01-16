import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val nInspected = scanner.nextInt()
    val range = scanner.nextInt()..scanner.nextInt()
    println(nInspected in range)
}