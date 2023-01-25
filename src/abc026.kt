import kotlin.math.PI
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
    solveABC026B()
}

fun solveABC026B() {
    val n = readInt()
    val r = mutableListOf<Int>()
    repeat(n) {
        r.add(readInt())
    }
    r.sortDescending()

    var tmp = 0
    for (i in 0 until n) {
        if (i % 2 == 0) {
            // plus
            tmp += r[i] * r[i]
        } else {
            // minus
            tmp -= r[i] * r[i]
        }
    }

    println(tmp * PI)
}

fun solveABC026A() {
    val a = readInt()
    var res = 0
    for (i in 1..100) {
        for (j in 1..100) {
            if (i + j == a) {
                res = max(res, i * j)
            }
        }
    }
    println(res)
}