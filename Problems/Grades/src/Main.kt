import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val aGrades = intArrayOf(0, 0, 0, 0)
    val n = scanner.nextInt()
    repeat(n) {
        val x = scanner.nextInt()
        for (i in 0..3) {
            if (i + 2 == x) {
                aGrades[i]++
            }
        }
    }
    for (i in 0..3) {
        print(aGrades[i])
        if (i != 3) {
            print(" ")
        }
    }
}