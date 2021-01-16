import java.util.*

fun main(args: Array<String>) {
    // write your code here
    val scanner = Scanner(System.`in`)
    var nInitialAmount = scanner.nextInt()
    while (scanner.hasNext()) {
        val nPurchase = scanner.nextInt()
        if (nPurchase > nInitialAmount) {
            println("Error, insufficient funds for the purchase. You have $nInitialAmount, but you need $nPurchase.")
            return
        }
        nInitialAmount -= nPurchase
    }
    println("Thank you for choosing us to manage your account! You have $nInitialAmount money.")
}