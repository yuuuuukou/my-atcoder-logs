import kotlin.math.max

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
    solveABC031B()
}

fun solveABC031B() {
    val (l, h) = readInts()
    val n = readInt()
    repeat(n) {
        val ai = readInt()
        if (ai <= l) {
            println(l - ai)
        } else if (ai in l..h) {
            println(0)
        } else {
            println(-1)
        }
    }
}

fun solveABC031A() {
    val (a, d) = readInts()
    println(max((a + 1) * d, a * (d + 1)))
}