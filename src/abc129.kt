import kotlin.math.absoluteValue
import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC129B()
}

fun solveABC129B() {
    val n = readInt()
    val w = readInts()

    var res = Int.MAX_VALUE
    for (i in 0 until n - 1) {
        val s1 = w.subList(0, i + 1).sum()
        val s2 = w.subList(i + 1, n).sum()
        val s = (s1 - s2).absoluteValue
        res = min(s, res)
    }

    println(res)
}

fun solveABC129A() {
    val pqr = readInts().sorted()
    println(pqr[0] + pqr[1])
}