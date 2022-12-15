import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC137B()
}

fun solveABC137B() {
    val (k, x) = readInts()
    val start = x - k + 1
    val end = x + k - 1
    for (i in start..end) {
        print("$i ")
    }
}

fun solveABC137A() {
    val (a, b) = readInts()
    println(max(a + b, max(a - b, a * b)))
}