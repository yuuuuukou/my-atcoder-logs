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
    solveABC243A()
}

fun solveABC243A() {
    val (v, a, b, c) = readInts()

    var tmp = v
    while (true) {
        if (tmp < a) {
            println("F")
            return
        }
        tmp -= a
        if (tmp < b) {
            println("M")
            return
        }
        tmp -= b
        if (tmp < c) {
            println("T")
            return
        }
        tmp -= c
    }
}