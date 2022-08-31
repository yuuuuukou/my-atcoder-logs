import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC075A()
}

fun solveABC075A() {
    val (a, b, c) = readInts()
    if (a == b) {
        println(c)
    } else {
        if (a == c) {
            println(b)
        } else {
            println(a)
        }
    }
}