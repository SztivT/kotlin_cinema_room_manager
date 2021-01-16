import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var aNumbers = emptyArray<Int>()
    var nCounter = 0
    repeat(scanner.nextInt()) {
        aNumbers += scanner.nextInt()
    }
    val nToFind = scanner.nextInt()
    for (i in aNumbers) {
        if (i == nToFind) {
            nCounter++
        }
    }
    print(nCounter)
}