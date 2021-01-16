import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var nMaxDivisible = 0
    repeat(scanner.nextInt()) {
        val x = scanner.nextInt()
        if (x % 4 == 0 && x > nMaxDivisible) {
            nMaxDivisible = x
        }
    }
    print(nMaxDivisible)
}