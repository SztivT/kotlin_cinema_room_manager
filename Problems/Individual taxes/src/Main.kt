import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val nNoOfCompanies = scanner.nextInt()
    var aIncome = emptyArray<Double>()
    var nMaxTax = 0.0
    var nCompanyNo = 1
    repeat(nNoOfCompanies) {
        aIncome += scanner.nextDouble()
    }
    for (i in 0 until nNoOfCompanies) {
        val nPaidTax = aIncome[i] * scanner.nextInt() / 100
        if (nPaidTax > nMaxTax) {
            nMaxTax = nPaidTax
            nCompanyNo = i + 1
        }
    }
    print(nCompanyNo)
}