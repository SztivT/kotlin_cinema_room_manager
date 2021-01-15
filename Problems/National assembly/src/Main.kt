import java.util.*

fun main() {
    // write your code here
    var scanner = Scanner(System.`in`)
    val dPopulation = scanner.nextDouble()
    var dAssembly = Math.cbrt(dPopulation)
    var nAssembly = dAssembly.toInt()
    println(nAssembly)
}