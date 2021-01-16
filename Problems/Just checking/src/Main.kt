import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var aNumbers = emptyArray<Int>()
    var bOccured = false
    repeat(scanner.nextInt()) {
        aNumbers += scanner.nextInt()
    }
    val p = scanner.nextInt()
    val m = scanner.nextInt()
    for (i in 1 until aNumbers.size) {
        if (p == aNumbers[i]) {
            if (m == aNumbers[i - 1]) {
                bOccured = true
                break
            }
        } else if (m == aNumbers[i]) {
            if (p == aNumbers[i - 1]) {
                bOccured = true
                break

            }
        }
    }
    print(if (bOccured) "YES" else "NO")
}