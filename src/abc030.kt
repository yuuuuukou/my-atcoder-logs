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
    solveABC030B()
}

fun solveABC030B() {
    val (n, m) = readInts()

    val short = (n % 12) * 30 + m * 0.5
    val short2 = (n % 12) * 30 + m * 0.5 + 360
    val long = m * 6
    val long2 = m * 6 + 360

    println(
        min(
            min((short - long).absoluteValue, (short - long2).absoluteValue),
            min((short2 - long).absoluteValue, (short2 - long2).absoluteValue)
        )
    )
}

fun solveABC030A() {
    val (a, b, c, d) = readDoubles()
    val TakahasiWinRate = b / a
    val AokiWinRate = d / c
    when {
        TakahasiWinRate < AokiWinRate -> println("AOKI")
        TakahasiWinRate == AokiWinRate -> println("DRAW")
        TakahasiWinRate > AokiWinRate -> println("TAKAHASHI")
    }
}