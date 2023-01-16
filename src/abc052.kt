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
    solveABC052B()
}

fun solveABC052B() {
    val n = readInt()
    val s = readString()

    var max = 0
    var x = 0
    for (si in s) {
        when (si) {
            'I' -> x++
            'D' -> x--
        }
        max = max(max, x)
    }

    println(max)
}

fun solveABC052A() {
    val (a, b, c, d) = readInts()
    println(max(a * b, c * d))
}