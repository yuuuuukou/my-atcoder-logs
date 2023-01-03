private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC108B()
}

fun solveABC108B() {
    val (x1, y1, x2, y2) = readInts()

    // ベクトルで考える
    var dx = x2 - x1
    var dy = y2 - y1

    val x3 = dx * 0 - dy * 1 + x2
    val y3 = dx * 1 + dy * 0 + y2

    dx = x3 - x2
    dy = y3 - y2

    val x4 = dx * 0 - dy * 1 + x3
    val y4 = dx * 1 + dy * 0 + y3

    println("$x3 $y3 $x4 $y4")
}

fun solveABC108A() {
    val k = MutableList(readInt()) { index -> index }
    val even = k.count { it % 2 == 0 }
    val odd = k.count { it % 2 != 0 }
    println(even * odd)
}