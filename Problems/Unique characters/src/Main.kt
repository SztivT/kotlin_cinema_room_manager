fun main() {
    // put your code here

    print(counter(readLine()!!))
}

fun counter(input: String): Int {
    var nCounter = 0
    for (c in 97..122) {
        nCounter += occurOnce(c, input)
    }
    return nCounter
}

fun occurOnce(c: Int, input: String): Int {
    var isOccur = false
    for (l in input) {
        if (c.toChar() == l) {
            if (isOccur) {
                return 0
            }
            isOccur = true
        }
    }
    return if (isOccur) 1 else 0
}
