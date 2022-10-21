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
    solveABC255A()
}

fun solveABC255A() {
    val (r, c) = readInts()
    val (a11, a12) = readInts()
    val (a21, a22) = readInts()
    if (r == 1) {
        if (c == 1) {
            println(a11)
        } else {
            println(a12)
        }
    } else {
        if (c == 1) {
            println(a21)
        } else {
            println(a22)
        }
    }
}