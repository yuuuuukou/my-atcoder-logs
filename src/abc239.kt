import java.math.RoundingMode
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
    solveABC239B()
}

fun solveABC239B() {
    val x = readBigDecimal()
    println(x.divide(10.toBigDecimal(), RoundingMode.FLOOR))
}

fun solveABC239A() {
    val h = readInt()
    println(sqrt(h * (12800000 + h).toDouble()))
}