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
    solveABC022A()
}

fun solveABC022A() {
    val (n, s, t) = readInts()
    var w = readInt()
    var res = 0
    if (w in s..t) {
        res++
    }
    for (ai in 1 until n) {
        w += readInt()
        if (w in s..t) {
            res++
        }
    }

    println(res)
}