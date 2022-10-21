import kotlin.math.absoluteValue

private fun readString() = readLine()!!
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
    solveABC250A()
}

fun solveABC250A() {
    val (h, w) = readInts()
    val (r, c) = readInts()

    var cnt = 0
    for (row in 1..h) {
        for (col in 1..w) {
            if ((row - r).absoluteValue + (col - c).absoluteValue == 1) {
                cnt++
            }
        }
    }

    println(cnt)
}