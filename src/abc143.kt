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
    solveABC143A()
}

fun solveABC143B() {
    val n = readInt()
    val d = readInts()

    var sum = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            sum += d[i] * d[j]
        }
    }

    println(sum)
}

fun solveABC143A() {
    val (a, b) = readInts()
    println(max(0, a - b * 2))
}
