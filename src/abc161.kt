import kotlin.math.abs
import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC161B()
}

fun solveABC161C() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }

    val n2 = n % k
    println(min(n2, abs(n2 - k)))
}


fun solveABC161B() {
    val (n, m) = readInts()
    val a = readInts().sortedDescending()
    val sum = a.sum()
    for (i in 0 until m) {
        if (a[i] < sum.toDouble() * 1 / (4 * m)) {
            println("No")
            return
        }
    }
    println("Yes")
}

fun solveABC161A() {
    val (x, y, z) = readInts()
    println("$z $x $y")
}