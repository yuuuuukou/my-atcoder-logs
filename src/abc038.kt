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
    solveABC038B()
}

fun solveABC038B() {
    val (h1, w1) = readInts()
    val (h2, w2) = readInts()

    if (h1 == h2 || h1 == w2 || w1 == h2 || w1 == w2) {
        println("YES")
    } else {
        println("NO")
    }
}

fun solveABC038A() {
    val s = readString()
    if (s[s.lastIndex].toString() == "T") {
        println("YES")
    } else {
        println("NO")
    }
}