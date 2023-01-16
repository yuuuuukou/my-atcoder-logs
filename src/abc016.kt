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
    solveABC016B()
}

fun solveABC016B() {
    val (a, b, c) = readInts()

    val isAPlusB = a + b == c
    val isAMinusB = a - b == c
    if (isAPlusB && isAMinusB) {
        println("?")
    } else if (isAPlusB) {
        println("+")
    } else if (isAMinusB) {
        println("-")
    } else {
        println("!")
    }
}

fun solveABC016A() {
    val (m, d) = readInts()
    if (m % d == 0) {
        println("YES")
    } else {
        println("NO")
    }
}