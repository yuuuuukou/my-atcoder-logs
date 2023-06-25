import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC136C()
}

fun solveABC136C() {
    val n = readInt()
    val h = readInts()

    for (i in 0 until n - 1) {
        if (h[i] >= h[i + 1] && ((i == 0) || (i != 0 && h[i - 1] < h[i]))) {
            h[i]--
        }
        if (h[i] > h[i + 1]) {
            println("No")
            return
        }
    }

    println("Yes")
}

fun solveABC136B() {
    val n = readLine()!!.toInt()

    var cnt = 0
    for (i in 1..n) {
        if (i.toString().length % 2 != 0) {
            cnt++
        }
    }

    println(cnt)
}

fun solveABC136A() {
    val (a, b, c) = readInts()
    println(max(c - (a - b), 0))
}