import kotlin.math.max
import kotlin.math.pow

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC148A()
}

fun solveABC148A() {
    val a = readInt()
    val b = readInt()
    if (a == 1 && b == 2 || a == 2 && b == 1) {
        println(3)
    } else if (a == 2 && b == 3 || a == 3 && b == 2) {
        println(1)
    } else {
        println(2)
    }
}