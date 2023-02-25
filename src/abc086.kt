import kotlin.math.pow
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
    solveABC086B()
}

fun solveABC086B() {
    val ab = readLine()!!.replace(" ", "").toInt()
    val x = sqrt(ab.toDouble()).toInt()
    if (x.toDouble().pow(2) == ab.toDouble()) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC086A() {
    val (a, b) = readInts()
    if ((a * b) % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}