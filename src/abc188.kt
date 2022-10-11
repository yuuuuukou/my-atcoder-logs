import kotlin.math.absoluteValue

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC188A()
}

fun solveABC188A() {
    val (x, y) = readInts()
    if ((x - y).absoluteValue <= 2) {
        println("Yes")
    } else {
        println("No")
    }
}