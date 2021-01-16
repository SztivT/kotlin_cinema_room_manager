import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val range1 = scanner.nextInt()..scanner.nextInt()
    val range2 = scanner.nextInt()..scanner.nextInt()
    val nInspected = scanner.nextInt()
    println(nInspected in range1 && nInspected in range2)
}