import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC057B()
}

fun solveABC057C() {
    val n = readLine()!!.toLong()

    var ans = Long.MAX_VALUE

    for (a in 1..sqrt(n.toDouble()).toInt()) {
        if (n % a == 0L) {
            val b = n / a
            ans = min(ans, f(a.toLong(), b))
        }
    }

    println(ans)
}

fun solveABC057B() {
    val (n, m) = readInts()
    val students = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (a, b) = readInts()
        students.add(Pair(a, b))
    }
    val checkPoints = mutableListOf<Pair<Int, Int>>()
    repeat(m) {
        val (c, d) = readInts()
        checkPoints.add(Pair(c, d))
    }

    for (i in 0 until n) {
        var resIndex = -1
        var resValue = Int.MAX_VALUE
        for (j in 0 until m) {
            val tmp = (students[i].first - checkPoints[j].first).absoluteValue +
                    (students[i].second - checkPoints[j].second).absoluteValue
            if (resValue > tmp) {
                resIndex = j
                resValue = tmp
            }
        }
        println(resIndex + 1)
    }
}

fun f(a: Long, b: Long): Long {
    return max(a.toString().length, b.toString().length).toLong()
}

fun solveABC057A() {
    val (a, b) = readInts()

    println((a + b) % 24)
}