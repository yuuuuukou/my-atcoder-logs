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
    solveABC124C()
}

fun solveABC124C() {
    val s = readLn()

    var pattern1 = 0
    for ((i, si) in s.withIndex()) {
        if (i % 2 == 0) {
            if (si == '0') {
                pattern1++
            }
        } else {
            if (si == '1') {
                pattern1++
            }
        }
    }

    var pattern2 = 0
    for ((i, si) in s.withIndex()) {
        if (i % 2 != 0) {
            if (si == '0') {
                pattern2++
            }
        } else {
            if (si == '1') {
                pattern2++
            }
        }
    }

    println(min(pattern1, pattern2))
}

fun solveABC124B() {
    val n = readInt()
    val h = readInts()

    var max = 0
    var cnt = 0
    for (i in 0 until n) {
        if (h[i] >= max) {
            cnt++
        }
        max = max(max, h[i])
    }

    println(cnt)
}

fun solveABC124A() {
    val (a, b) = readInts()
    if (a == b) {
        println(a + b)
    } else {
        println(max(a, b) + max(a, b) - 1)
    }
}