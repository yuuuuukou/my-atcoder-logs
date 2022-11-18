import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

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
    solveABC234B()
}

fun solveABC234B() {
    val n = readInt()

    val xy = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = readInts()
        xy.add(x to y)
    }

    var res = 0.0
    for (i in 0 until n) {
        for (j in 0 until n) {
            val x1 = xy[i].first
            val y1 = xy[i].second
            val x2 = xy[j].first
            val y2 = xy[j].second

            val distance = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))

            res = max(res, distance)
        }
    }

    println(res)
}

fun solveABC234A() {
    val t = readLong()
    println(f(f(f(t) + t) + f(f(t))))
}

private fun f(t: Long): Long = t * t + 2 * t + 3