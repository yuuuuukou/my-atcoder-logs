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
    Thread(null, {
        solveABC288B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC288B() {
    val (n, k) = readInts()
    val s = mutableListOf<String>()
    repeat(k) {
        s.add(readString())
    }
    repeat(n - k) {
        readString()
    }
    s.sort()
    for (si in s) {
        println(si)
    }
}

fun solveABC288A() {
    val n = readInt()
    repeat(n) {
        val (ai, bi) = readLongs()
        println(ai + bi)
    }
}