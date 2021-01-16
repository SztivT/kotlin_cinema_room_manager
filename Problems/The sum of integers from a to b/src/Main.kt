import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val nLeft = scanner.nextInt()
    val nRight = scanner.nextInt()
    var nSum = 0
    for (i in nLeft..nRight) {
        nSum += i
    }
    print(nSum)
}