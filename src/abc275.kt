import java.math.BigDecimal

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
    solveABC275B()
}

fun solveABC275B() {
    val abcdef = readBigDecimals()
    println(((abcdef[0] * abcdef[1] * abcdef[2]) - (abcdef[3] * abcdef[4] * abcdef[5])) % BigDecimal(998244353))
}

fun solveABC275A() {
    /*val n = */readInt()
    val h = readInts()

    var max = 0
    var maxIndex = 0
    for ((index, hi) in h.withIndex()) {
        if (max < hi) {
            max = hi
            maxIndex = index + 1
        }
    }
    println(maxIndex)
}
