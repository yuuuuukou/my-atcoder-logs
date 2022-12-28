import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.sqrt

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC180B()
}

fun solveABC180B() {
    val n = readLong()
    val x = readLongs()

    var manhattan = 0L
    var euclidTmp = 0L
    var chebyshev = 0L
    for (xi in x) {
        manhattan += xi.absoluteValue
        euclidTmp += xi * xi
        chebyshev = max(chebyshev, xi.absoluteValue)
    }
    println(manhattan)
    println(sqrt(euclidTmp.toDouble()))
    println(chebyshev)
}

fun solveABC180A() {
    val (n, a, b) = readInts()
    println(n - a + b)
}