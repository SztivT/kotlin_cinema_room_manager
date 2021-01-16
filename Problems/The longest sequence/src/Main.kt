import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    var nMaxCount = 0
    var nCounter = 0
    var y = 0
    repeat(scanner.nextInt()) {
        val x = scanner.nextInt()
        if (x >= y) {
            if (++nCounter > nMaxCount) {
                nMaxCount = nCounter
            }
        } else {
            nCounter = 1
        }
        y = x

    }
    print(nMaxCount)
}