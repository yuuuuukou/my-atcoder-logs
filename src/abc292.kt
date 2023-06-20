private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC292B()
}

fun solveABC292B() {
    val (n, q) = readInts()

    val cards = MutableList(n + 1) { 0 }

    repeat(q) {
        val event = readInts()
        when (event[0]) {
            1 -> cards[event[1]] += 1
            2 -> cards[event[1]] += 2
            3 -> println(if (cards[event[1]] >= 2) "Yes" else "No")
        }
    }
}

fun solveABC292A() {
    println(readString().toUpperCase())
}
