fun main() {
    // put your code here
    val a = readLine()?.toInt()
    val b = readLine()?.toInt()
    val c = readLine()?.toInt()
    if (a!! <= 0 && b!! <= 0 && c!! <= 0) {
        print(false)
    } else if (a > 0 && b!! > 0 && c!! > 0) {
        print(false)
    } else {
        print((a > 0) xor (b!! > 0) xor (c!! > 0))
    }
}