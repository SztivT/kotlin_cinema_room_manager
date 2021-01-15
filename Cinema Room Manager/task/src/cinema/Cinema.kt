package cinema


fun main() {
    // write your code here
    println("Enter the number of rows:")
    val nRows = readLine()?.toInt()
    println("Enter the number of seats in each row:")
    val nSeats = readLine()?.toInt()
    val nTotalSeats = nRows?.times(nSeats!!)
    val nProfit = if (nTotalSeats!! < 60) {
        nTotalSeats * 10
    } else {
        val nHalf = nRows / 2
        (nHalf * 10 * nSeats!!) + ((nRows - nHalf) * 8 * nSeats)
    }
    println("Total income:")
    println("$$nProfit")
}