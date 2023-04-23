import kotlin.math.PI

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC163C()
}

fun solveABC163C() {
    val n = readInt()
    val a = readInts()
    val map = mutableMapOf<Int, Int>()
    for (ai in a) {
        map[ai] = (map[ai] ?: 0) + 1
    }
    for (i in 1..n) {
        println(map[i] ?: 0)
    }
}

fun solveABC163B() {
    val (n, m) = readInts()
    val a = readInts()
    if (n - a.sum() >= 0) {
        println(n - a.sum())
    } else {
        println(-1)
    }
}

fun solveABC163A() {
    val r = readInt()
    println(r * 2 * PI)
}