import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC148D()
}

fun solveABC148D() {
    val n = readInt()
    val a = readInts()

    var res = Int.MAX_VALUE
    var target = 0
    for ((i, ai) in a.withIndex()) {
        if (ai == 1) {
            // reset
            if (target > 0) {
                res = min(n - (target - 1), res)
            }
            target = 2
        } else if (ai == target) {
            target++
        }
    }
    if (target > 0) {
        res = min(n - (target - 1), res)
    }

    if (res == Int.MAX_VALUE) {
        println("-1")
    } else {
        println(res)
    }
}

fun solveABC148C() {
    val (a, b) = readLongs()

    for (i in 1..b) {
        val tmp = a * i
        if (tmp % b == 0L) {
            println(tmp)
            return
        }
    }
}

fun solveABC148B() {
    val n = readInt()
    val (s, t) = readStrings()

    var res = ""
    for (i in 0 until n) {
        res += s[i]
        res += t[i]
    }

    println(res)
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