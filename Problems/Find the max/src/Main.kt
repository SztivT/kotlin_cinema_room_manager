import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var aNumbers = emptyArray<Int>()
    var nMax = 0
    var nPos = 0
    repeat(scanner.nextInt()) {
        aNumbers += scanner.nextInt()
    }
    for (i in aNumbers.indices) {
        if (aNumbers[i] > nMax) {
            nMax = aNumbers[i]
            nPos = i
        }
    }
    print(nPos)
}