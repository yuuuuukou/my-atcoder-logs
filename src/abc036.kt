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
    solveABC036B()
}

fun solveABC036B() {
    val n = readInt()
    val s = mutableListOf<String>()
    repeat(n) {
        s.add(readString())
    }

    // ij
    // 00 01 02
    // 10 11 12
    // 20 21 22
    // ↓
    // 20 10 00
    // 21 11 01
    // 22 12 02
    for (j in 0..s.lastIndex) {
        for (i in s.lastIndex downTo 0) {
            print(s[i][j])
        }
        println()
    }
}

fun solveABC036A() {
    val (a, b) = readInts()
    if (b % a == 0) {
        println(b / a)
    } else {
        println(b / a + 1)
    }
}