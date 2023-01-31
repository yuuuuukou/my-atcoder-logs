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
    solveABC286B()
}

fun solveABC286B() {
    val n = readInt()
    val s = readString()
    println(s.replace("na", "nya"))
}

fun solveABC286A() {
    val (n, p, q, r, s) = readInts()
    val a = readInts()
    for (i in 1..n) {
        if (i in p..q) {
            val tmp = i - p
            print("${a[r - 1 + tmp]} ")
        } else if (i in r..s) {
            val tmp = i - r
            print("${a[p - 1 + tmp]} ")
        } else {
            print("${a[i - 1]} ")
        }
    }
}