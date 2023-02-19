import kotlin.math.absoluteValue
import kotlin.math.min

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
    solveABC040B()
}

fun solveABC040B() {
    val n = readInt()

    var res = Int.MAX_VALUE
    for (i in 1..100000) {
        for (j in 1..100000) {
            if (i * j > n) break

            val reminder = n - i * j
            res = min(res, (i - j).absoluteValue + reminder)
        }
    }

    println(res)
}

fun solveABC040A() {
    val (n, x) = readInts()

    val front = x - 1
    val back = n - x
    println(min(front, back))
}