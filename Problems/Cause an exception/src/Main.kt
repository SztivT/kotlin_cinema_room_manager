fun readNextInt(): Int {
    return readLine()!!.toInt()
}

fun runIncrementer() {
    val increment = 1 + readNextInt()
    println(increment)
}

fun main() {
    runIncrementer()
}