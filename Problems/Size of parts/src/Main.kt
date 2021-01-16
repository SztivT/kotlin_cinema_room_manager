import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var nLarger = 0
    var nSmaller = 0
    var nPercect = 0
    repeat(n) {
        val x = scanner.nextInt()
        if (x == 1) {
            nLarger++
        }
        if (x == -1) {
            nSmaller++
        }
        if (x == 0) {
            nPercect++
        }
    }
    println("$nPercect $nLarger $nSmaller")
}