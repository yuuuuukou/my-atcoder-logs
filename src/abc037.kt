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
    solveABC037B()
}

fun solveABC037B() {
    val (n, q) = readInts()

    val res = MutableList(n + 1) { 0L }
    repeat(q) {
        val (li, ri, ti) = readLongs()
        for (i in li .. ri) {
            res[i.toInt()] = ti
        }
    }

    res.removeAt(0)
    for (item in res) {
        println(item)
    }
}

fun solveABC037A() {
    val (a, b, c) = readInts()
    val price = min(a, b)
    println(c / price)
}