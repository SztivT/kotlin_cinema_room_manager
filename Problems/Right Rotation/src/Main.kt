import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var aNumbers = emptyArray<Int>()
    repeat(scanner.nextInt()) {
        aNumbers += scanner.nextInt()
    }
    var nShift = scanner.nextInt()
    if (nShift > aNumbers.size) {
        nShift %= aNumbers.size
    }
    for (i in aNumbers.size - nShift until aNumbers.size) {
        print("${aNumbers[i]} ")
    }
    for (i in 0 until aNumbers.size - nShift) {
        print(aNumbers[i])
        if (i < aNumbers.size - nShift - 1) {
            print(" ")
        }
    }
}