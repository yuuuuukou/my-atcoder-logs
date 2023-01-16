import kotlin.math.absoluteValue
import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC076B()
}

fun solveABC076B() {
    val n = readInt()
    val k = readInt()

    var res = 1
    repeat(n) {
        val tmp1 = res * 2
        val tmp2 = res + k
        res = min(tmp1, tmp2)
    }

    println(res)
}

fun solveABC076A() {
    val r = readInt()
    val g = readInt()

    // (r + x)/2 = g
    // x/2 = g - r/2
    val x = 2 * g - r

    println(x)
}
