import kotlin.math.absoluteValue

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC195A()
}

fun solveABC195A() {
    val (m, h) = readInts()
    if (h % m == 0) {
        println("Yes")
    } else {
        println("No")
    }
}