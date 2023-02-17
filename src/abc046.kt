import kotlin.math.pow

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
    solveABC046B()
}

fun solveABC046B() {
    val (n, k) = readInts()

    // 1個目    : k通り   が   1回
    // 2個目以降 : k-1通り が n-1回
    // (1個だけの場合はk通り)
    println(if (n == 1) k else k * (k - 1).toDouble().pow(n - 1).toInt())
}

fun solveABC046A() {
    val (a, b, c) = readStrings()

    val map = mutableMapOf<String, String>()
    map[a] = "1"
    map[b] = "1"
    map[c] = "1"

    println(map.size)
}
