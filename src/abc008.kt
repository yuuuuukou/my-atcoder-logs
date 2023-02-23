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
    solveABC008B()
}

fun solveABC008B() {
    val n = readInt()
    val s = mutableMapOf<String, Int>()
    repeat(n) {
        val si = readString()
        s[si] = (s[si] ?: 0) + 1
    }

    println(s.maxBy { it.value }?.key)
}

fun solveABC008A() {
    val (s, t) = readInts()
    println((s..t).count())
}