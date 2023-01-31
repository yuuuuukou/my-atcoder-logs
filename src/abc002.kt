import kotlin.math.max

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
    solveABC002B()
}

fun solveABC002B() {
    val w = readString()
    for (wi in w) {
        if (wi !in arrayOf('a', 'i', 'u', 'e', 'o')) {
            print(wi)
        }
    }
    println()
}

fun solveABC002A() {
    val (x, y) = readInts()
    println(max(x, y))
}