import kotlin.math.pow

fun main() {
    // put your code here
    val x = readLine()?.toDouble()
    println(x?.pow(3)?.plus(x.pow(2).plus(x.plus(1))))
}