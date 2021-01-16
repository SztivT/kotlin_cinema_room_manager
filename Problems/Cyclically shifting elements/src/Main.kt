import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val lNumbers = mutableListOf<Int>()
    repeat(scanner.nextInt()) {
        lNumbers.add(scanner.nextInt())
    }
    Collections.rotate(lNumbers, 1)
    for (i in 0 until lNumbers.size) {
        print(lNumbers[i])
        if (i < lNumbers.size - 1) {
            print(" ")
        }
    }
}
