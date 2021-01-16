val numbers = IntArray(100)

var i = 0
while (i in 0..99) {
    if (i == 0 || i == 9 || i == 99) {
        numbers[i] = i + 1
    } else {
        numbers[i] = 0
    }
    i++
}
