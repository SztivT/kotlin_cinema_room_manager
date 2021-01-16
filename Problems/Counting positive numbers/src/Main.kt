import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    var nPositiveCount = 0
    repeat(scanner.nextInt()) {
        if (scanner.nextInt() > 0) {
            nPositiveCount++
        }
    }
    print(nPositiveCount)
}