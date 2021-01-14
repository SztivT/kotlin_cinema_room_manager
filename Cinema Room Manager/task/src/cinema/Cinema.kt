package cinema

fun main() {
    // write your code here
    println("Cinema:")
    print(" ")
    for (i in 1..8) {
        print(i)
        print(" ")
    }
    for (i in 1..7){
        print("\n")
        print(i)
        for (i in 1..8){
            print(" ")
            print("S")
        }
    }
}