// write your function here
const val SENGLISHVOWELS = "aAeEiIoOuU"
fun isVowel(letter: Char): Boolean {
    var isVowel = false
    for (i in SENGLISHVOWELS) {
        if (i == letter) {
            isVowel = true
            break
        }
    }
    return isVowel
}

fun main() {

    val letter = readLine()!!.first()

    println(isVowel(letter))
}