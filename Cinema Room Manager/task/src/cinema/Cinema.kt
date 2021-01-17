package cinema

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    // write your code here
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
    menu(aCinema, aTicket)
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

fun buyTicket(aCinema: Array<CharArray>, aTicket: Array<IntArray>) {
    println("Enter a row number:")
    val nReservedRow = scanner.nextInt() - 1
    println("Enter a seat number in that row:")
    val nReservedSeat = scanner.nextInt() - 1
    if (nReservedRow !in aTicket.indices || nReservedSeat !in aTicket[nReservedRow].indices) {
        println("Wrong input!")
        buyTicket(aCinema, aTicket)
    } else {
        if (aCinema[nReservedRow][nReservedSeat] == 'B') {
            println("That ticket has already been purchased!")
            buyTicket(aCinema, aTicket)
        } else {
            println("Ticket price: $${aTicket[nReservedRow][nReservedSeat]}")
            aCinema[nReservedRow][nReservedSeat] = 'B'
        }
    }

}

fun ticketPurchased(aCinema: Array<CharArray>, aTicket: Array<IntArray>) {
    var ticketSold = 0
    var fullHouse = 0
    var income = 0
    var total = 0
    for (r in aCinema.indices) {
        for (s in aCinema[r].indices) {
            if (aCinema[r][s] == 'B') {
                ticketSold++
                income += aTicket[r][s]
            }
            fullHouse++
            total += aTicket[r][s]
        }
    }
    println("Number of purchased tickets: $ticketSold")
    val nPercentage =  ticketSold.toDouble() / fullHouse.toDouble() * 100
    val sPercentage = String.format("%.2f", nPercentage)
    println("Percentage: $sPercentage%")
    println("Current income: $$income")
    println("Total income: $$total")

}

fun menu(aCinema: Array<CharArray>, aTicket: Array<IntArray>) {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    when (scanner.nextInt()) {
        0 -> return
        1 -> {
            drawCinema(aCinema)
            menu(aCinema, aTicket)
        }
        2 -> {
            buyTicket(aCinema, aTicket)
            menu(aCinema, aTicket)
        }
        3 -> {
            ticketPurchased(aCinema, aTicket)
            menu(aCinema, aTicket)
        }
        else -> {
            println("Wrong input!")
            menu(aCinema, aTicket)
        }
    }
}