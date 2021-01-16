import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    var nLargest = scanner.nextInt()
    var nPosition = 1
    var nCurrentPosition = 1
    while (scanner.hasNextInt()) {
        nCurrentPosition++
        val x = scanner.nextInt()
        if (x > nLargest) {
            nLargest = x
            nPosition = nCurrentPosition
        }
    }
    println("$nLargest $nPosition")
}