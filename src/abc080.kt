import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC080B()
}

fun solveABC080B() {
    val n = readLn()

    var fx = 0
    for (ni in n) {
        fx += ni.toString().toInt()
    }

    if (n.toInt() % fx == 0) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC080A() {
    val (n, a, b) = readInts()

    println(min(a * n, b))
}