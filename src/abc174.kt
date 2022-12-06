import kotlin.math.sqrt

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
    solveABC174B()
}

fun solveABC174B() {
    val (n, d) = readInts()

    var cnt = 0
    repeat(n) {
        val (xi, yi) = readDoubles()
        if (sqrt(xi * xi + yi * yi) <= d) {
            cnt++
        }
    }

    println(cnt)
}

fun solveABC174A() {
    val x = readInt()
    if (x >= 30) {
        println("Yes")
    } else {
        println("No")
    }
}