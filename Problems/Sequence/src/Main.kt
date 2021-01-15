import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val a = scanner.next().single()
    val b = scanner.next().single()
    val c = scanner.next().single()
    println(a == b - 1 && b == c - 1)
}