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
    solveABC242B()
}

fun solveABC242B() {
    val s = readString()
    println(s.toList().sorted().joinToString(""))
}

fun solveABC242A() {
    val (a, b, c, x) = readDoubles()

    if (x <= a) {
        println(1.toDouble())
    } else if (x in a + 1..b) {
        println(c / (b - a))
    } else {
        println(0)
    }
}