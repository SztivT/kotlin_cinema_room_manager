fun main(args: Array<String>) {
    // write your code here
    val nUnits = readLine()!!.toLong()
    println(
        when {
            nUnits in 1..4 -> "few"
            nUnits in 5..9 -> "several"
            nUnits in 10..19 -> "pack"
            nUnits in 20..49 -> "lots"
            nUnits in 50..99 -> "horde"
            nUnits in 100..249 -> "throng"
            nUnits in 250..499 -> "swarm"
            nUnits in 500..999 -> "zounds"
            nUnits > 999 -> "legion"
            else -> "no army"
        }
    )
}