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
    solveABC039B()
}

fun solveABC039B() {
    val x = readInt()

    for (n in 1..1000000000) {
        if (x == n * n * n * n) {
            println(n)
            return
        }
    }
}

fun solveABC039A() {
    val (a, b, c) = readInts()
    println(a * b * 2 + b * c * 2 + c * a * 2)
}