import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC076A()
}

fun solveABC076A() {
    val r = readInt()
    val g = readInt()

    // (r + x)/2 = g
    // x/2 = g - r/2
    val x = 2 * g - r

    println(x)
}
