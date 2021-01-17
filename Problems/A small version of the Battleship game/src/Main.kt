import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val aRows = IntArray(5)
    val aColumns = IntArray(5)
    var sRows = ""
    var sColumns = ""
    repeat(3) {
        aRows[scanner.nextInt() - 1] = 1
        aColumns[scanner.nextInt() - 1] = 1
    }
    for (i in 1..5) {
        if (aRows[i - 1] != 1) {
            sRows += "$i "
        }
        if (aColumns[i - 1] != 1) {
            sColumns += "$i "
        }
    }
    println(sRows.trim())
    println(sColumns.trim())
}
