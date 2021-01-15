import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    val y = scanner.nextInt()
    val z = scanner.nextInt()
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val nBox1Max = if (x > y && x > z) x else if (y > z) y else z
    val nBox1Min = if (x < y && x < z) x else if (y < z) y else z
    val nBox13 = if (x != nBox1Max && x != nBox1Min) x else if (y != nBox1Max && y != nBox1Min) y else z
    val nBox2Max = if (a > b && a > c) a else if (b > c) b else c
    val nBox2Min = if (a < b && a < c) a else if (b < c) b else c
    val nBox23 = if (a != nBox2Max && a != nBox2Min) a else if (b != nBox2Max && b != nBox2Min) b else c
    if (nBox2Max == nBox1Max && nBox1Min == nBox2Min && nBox13 == nBox23) {
        println("Box 1 = Box 2")
    } else if (nBox2Max >= nBox1Max && nBox2Min >= nBox1Min && nBox23 >= nBox13) {
        println("Box 1 < Box 2")
    } else if (nBox1Max >= nBox2Max && nBox1Min >= nBox2Min && nBox13 >= nBox23) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}