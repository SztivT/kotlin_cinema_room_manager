import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val nScanned = scanner.nextInt()
    var nPosition = 0
    for (i in 1..nScanned) {
        for (j in 1..i) {
            nPosition++
            print(i)
            if (nPosition == nScanned) {
                return
            }
            print(" ")
        }
    }
}