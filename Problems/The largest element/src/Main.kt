import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var nMax = 0
    do {
        val x = scanner.nextInt()
        if (x > nMax) {
            nMax = x
        }
    } while (x != 0)
    print(nMax)

}