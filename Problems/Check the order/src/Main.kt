import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    val lNums = mutableListOf<Int>()
    var bIsAscending = true
    repeat(scanner.nextInt()) {
        lNums.add(scanner.nextInt())
    }
    for (i in 1 until lNums.size) {
        if (lNums[i] < lNums[i - 1]) {
            bIsAscending = false
            break
        }
    }
    print(if (bIsAscending) "YES" else "NO")
}