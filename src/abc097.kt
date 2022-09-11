import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC097A()
}

fun solveABC097A() {
    val (a, b, c, d) = readInts()

    if ((a - b).absoluteValue <= d && (b - c).absoluteValue <= d || (a - c).absoluteValue <= d) {
        println("Yes")
    } else {
        println("No")
    }
}