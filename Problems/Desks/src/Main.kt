import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var nSum = 0;
    while (scanner.hasNext()) {
        val nStudents = scanner.next().toInt()
        var nDesk = nStudents/2
        if (nStudents % 2 == 1){
            nDesk++;
        }
        nSum += nDesk
    }
    println(nSum)
}