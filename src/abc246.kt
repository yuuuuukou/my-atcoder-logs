import kotlin.math.max
import kotlin.math.sqrt

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC246C()
}

fun solveABC246C() {
    var (n, k, x) = readInts()
    val a = readInts().sortedDescending().toMutableList()

    var cost = 0L

    // 一旦クーポンが無駄にならない範囲で使用
    for (i in a.indices) {
        if (k > 0) {
            if (a[i] >= x) {
                var num = if (a[i] / x <= k) a[i] / x else 1
                a[i] -= num * x
                cost += max(a[i], 0)
                k -= num
            } else {
                cost += a[i]
            }
        } else {
            cost += a[i]
        }
    }

    // 無駄になってもいいのでクーポンを使いきる
    a.sortDescending()
    for (i in a.indices) {
        if (k > 0) {
            cost -= a[i]
            k--
        }
    }

    println(cost)
}

fun solveABC246B() {
    val (a, b) = readDoubles()
    val c = sqrt(a * a + b * b)
    println("${a / c} ${b / c}")
}

fun solveABC246A() {
    val (x1, y1) = readInts()
    val (x2, y2) = readInts()
    val (x3, y3) = readInts()

    var x4 = if (x1 == x2) {
        x3
    } else if (x2 == x3) {
        x1
    } else {
        x2
    }
    var y4 = if (y1 == y2) {
        y3
    } else if (y2 == y3) {
        y1
    } else {
        y2
    }

    println("$x4 $y4")
}