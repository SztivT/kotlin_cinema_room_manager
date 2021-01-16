import java.util.*
import kotlin.math.ln

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    val lNums = mutableListOf<Int>()
    repeat(scanner.nextInt()) {
        lNums.add(scanner.nextInt())
    }
    if (lNums.size == 1) {
        print(lNums[0])
    } else {
        lNums.sort()
        println(lNums[lNums.size - 1] * lNums[lNums.size - 2])
    }
}