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
    solveABC228A()
}

fun solveABC228A() {
    val (s, t, x) = readInts()

    if (s < t) {
        if (x in s until t) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        val t2 = t + 24
        val x2 = x + 24
        if (x in s until t2 || x2 in s until t2) {
            println("Yes")
        } else {
            println("No")
        }
    }
}