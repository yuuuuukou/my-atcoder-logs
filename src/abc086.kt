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
    solveABC086B()
}

fun solveABC086B() {
    val n = readInt()
    val s = readStrings()

    val map = mutableMapOf<String, Int>()
    for (si in s) {
        map[si] = 1
    }

    when (map.count()) {
        3 -> println("Three")
        4 -> println("Four")
    }
}

fun solveABC086A() {
    val (a, b) = readInts()
    if ((a * b) % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}