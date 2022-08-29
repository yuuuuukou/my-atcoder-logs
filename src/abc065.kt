import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC065A()
}

fun solveABC065A() {
    val (x, a, b) = readInts()

    val taste = a - b

    if (taste >= 0) {
        println("delicious")
    } else if (taste.absoluteValue <= x) {
        println("safe")
    } else {
        println("dangerous")
    }
}