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
    solveABC013B()
}

fun solveABC013B() {
    val a = readInt()
    val b = readInt()

    var tmp1: Int
    var tmp2: Int
    if (b >= a) {
        tmp1 = b - a
        tmp2 = a + 10 - b
    } else {
        tmp1 = a - b
        tmp2 = b + 10 - a
    }
    println(min(tmp1, tmp2))
}

fun solveABC013A() {
    val x = readString()
    when (x) {
        "A" -> println(1)
        "B" -> println(2)
        "C" -> println(3)
        "D" -> println(4)
        "E" -> println(5)
    }
}