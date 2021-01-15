fun main(args: Array<String>) {
    // write your code here
    val cChar = readLine()?.first()
    println(cChar!!.toInt() in 49..57 || cChar.toInt() in 65..90)
}
