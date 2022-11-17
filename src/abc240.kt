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
    solveABC240B()
}

fun solveABC240B() {
    /*val n = */readInt()
    println(readInts().toSet().count())
}

fun solveABC240A() {
    val (a, b) = readInts()
    if (a == 10) {
        if (b == 1 || b == 9) {
            println("Yes")
        } else {
            println("No")
        }
    } else if (b == 10) {
        if (a == 1 || a == 9) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        if ((a - b).absoluteValue <= 1) {
            println("Yes")
        } else {
            println("No")
        }
    }
}