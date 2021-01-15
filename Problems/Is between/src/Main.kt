fun main() {
    // put your code here
    val nA = readLine()?.toInt()
    val nB = readLine()?.toInt()
    val nC = readLine()?.toInt()
    val nMax: Int
    val nMin: Int
    if (nB !!> nC!!) {
        nMax = nB
        nMin = nC
    } else {
        nMax = nC
        nMin = nB
    }
    print(nMin <= nA!! && nA <= nMax)
}