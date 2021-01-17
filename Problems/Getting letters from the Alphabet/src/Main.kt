import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    var sResult = ""
    val cLetter = scanner.next().single()
    for (c in 97..122) {
        if (c.toChar() == cLetter) {
            break
        }
        sResult += c.toChar()
    }
    println(sResult)

}