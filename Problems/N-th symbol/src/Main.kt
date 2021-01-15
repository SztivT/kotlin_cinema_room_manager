import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    val sInput = scanner.nextLine()
    val nIndex = scanner.nextInt()
    println("Symbol # $nIndex of the string \"$sInput\" is '${sInput[nIndex - 1]}'")
}