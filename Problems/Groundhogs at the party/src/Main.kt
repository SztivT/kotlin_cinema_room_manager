import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nCups = scanner.nextInt()
    var nMin = 10
    var nMax = 20
    val bIsWeekend = scanner.nextBoolean()
    if (bIsWeekend) {
        nMin += 5
        nMax += 5
    }
    val bIsSuccessful = nCups in nMin..nMax
    println(bIsSuccessful)

}