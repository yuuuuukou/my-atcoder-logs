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
    solveABC277B()
}

fun solveABC277B() {
    val n = readInt()
    val alreadyList = mutableListOf<String>()
    var res = "Yes"
    repeat(n) {
        val si = readString()
        val first = mutableListOf("H", "D", "C", "S")
        val second = mutableListOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K")
        if (si[0].toString() !in first || si[1].toString() !in second || si in alreadyList) {
            res = "No"
        }
        alreadyList.add(si)
    }
    println(res)
}

fun solveABC277A() {
    val (n, x) = readInts()
    val p = readInts()
    for ((i, pi) in p.withIndex()) {
        if (x == pi) {
            println(i + 1)
        }
    }
}
