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
    solveABC004B()
}

fun solveABC004B() {
    val c = mutableListOf<MutableList<String>>()
    c.add(readStrings())
    c.add(readStrings())
    c.add(readStrings())
    c.add(readStrings())
    for (i in 3 downTo 0) {
        for (j in 3 downTo 0) {
            print("${c[i][j]} ")
        }
        println()
    }
}

fun solveABC004A() {
    val n = readInt()
    println(2 * n)
}