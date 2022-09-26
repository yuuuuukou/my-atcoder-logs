import kotlin.math.max
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
    solveABC120A()
}

fun solveABC120B() {
    val (a, b, k) = readLine()!!.split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()
    for (i in 1..max(a, b)) {
        if (a % i == 0 && b % i == 0) {
            list.add(i)
        }
    }
    println(list.reversed()[k - 1])
}

fun solveABC120A() {
    val (a, b, c) = readInts()
    println(min(b / a, c))
}
