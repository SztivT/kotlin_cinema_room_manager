package cinema

import java.util.*


fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows:")
    val nTotalRows = scanner.nextInt()
    println("Enter the number of seats in each row:")
    val nSeatInRow = scanner.nextInt()
    val aCinema = Array(nTotalRows) { CharArray(nSeatInRow) }
    val aTicket = Array(nTotalRows) { IntArray(nSeatInRow) }
    val nTotalSeats = nTotalRows * nSeatInRow
    val nHalf = nTotalRows / 2
    for (i in 0 until nTotalRows) {
        for (j in 0 until nSeatInRow) {
            aCinema[i][j] = 'S'
            if (nTotalSeats <= 60) {
                aTicket[i][j] = 10
            } else {
                if (i < nHalf) {
                    aTicket[i][j] = 10
                } else {
                    aTicket[i][j] = 8
                }
            }
        }
    }
    drawCinema(aCinema)
    println("Enter a row number:")
    val nReservedRow = scanner.nextInt()
    println("Enter a seat number in that row:")
    val nReservedSeat = scanner.nextInt()
    println("Ticket price: $${aTicket[nReservedRow - 1][nReservedSeat - 1]}")
    aCinema[nReservedRow - 1][nReservedSeat - 1] = 'B'
    drawCinema(aCinema)

}

fun drawCinema(a2D: Array<CharArray>) {
    println("Cinema:")
    print("  ")
    for (s in 1..a2D[0].size) {
        print(s)
        if (s < a2D[0].size) {
            print(" ")
        } else {
            print("\n")
        }
    }
    for (r in a2D.indices) {
        print("${r + 1} ")
        for (s in a2D[r].indices) {
            print("${a2D[r][s]}")
            if (s < a2D[r].size - 1) {
                print(" ")
            } else {
                print("\n")
            }
        }
    }

}