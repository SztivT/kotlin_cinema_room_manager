import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val cChar: Char = scanner.next().single()
        print(cChar.isDigit())
        if (scanner.hasNext()) {
            print("\\")
        }
    }
}