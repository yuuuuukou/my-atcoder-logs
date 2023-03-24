private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
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
    solveTessokuBookB08()
}

fun solveTessokuBookB08() {
    val n = readInt()
    val matrix = MutableList(1502) { MutableList(1502) { 0 } }
    repeat(n) {
        val (xi, yi) = readInts()
        matrix[xi][yi] += 1
    }

    // x方向累積
    for (i in 0..1500) {
        var pre = 0
        for (j in 0..1500) {
            matrix[i][j] += pre
            pre = matrix[i][j]
        }
    }

    // y方向累積
    for (j in 0..1500) {
        var pre = 0
        for (i in 0..1500) {
            matrix[i][j] += pre
            pre = matrix[i][j]
        }
    }

    val q = readInt()
    repeat(q) {
        val (ai, bi, ci, di) = readInts()
        println(matrix[ci][di] + matrix[ai - 1][bi - 1] - matrix[ci][bi - 1] - matrix[ai - 1][di])
    }
}

fun solveTessokuBookA08() {
    val (h, w) = readInts()
    val x = mutableListOf<MutableList<Int>>()
    repeat(h) {
        x.add(readInts())
    }

    // 横方向累積和
    for (i in 0 until h) {
        var pre = 0
        for (j in 0 until w) {
            x[i][j] += pre
            pre = x[i][j]
        }
    }

    // 縦方向累積和
    for (j in 0 until w) {
        var pre = 0
        for (i in 0 until h) {
            x[i][j] += pre
            pre = x[i][j]
        }
    }

    val q = readInt()
    repeat(q) {
        val (a, b, c, d) = readInts()
        val ai = a - 1
        val bi = b - 1
        val ci = c - 1
        val di = d - 1

        var res = x[ci][di]
        if (ai != 0 && bi != 0) {
            res += x[ai - 1][bi - 1]
        }
        if (ai != 0) {
            res -= x[ai - 1][di]
        }
        if (bi != 0) {
            res -= x[ci][bi - 1]
        }
        println(res)
    }
}

fun solveTessokuBookB07() {
    val t = readInt()
    val n = readInt()

    val relative = MutableList(t + 2) { 0 }
    repeat(n) {
        val (li, ri) = readInts()
        relative[li] += 1
        relative[ri] -= 1
    }

    var pre = 0
    for (i in 0 until t) {
        pre += relative[i]
        println(pre)
    }
}

fun solveTessokuBookA07() {
    val d = readInt()
    val n = readInt()

    val relative = MutableList(d + 1) { 0 }
    repeat(n) {
        val (li, ri) = readInts()
        relative[li] += 1
        if (ri != d) {
            relative[ri + 1] -= 1
        }
    }

    var pre = 0
    for ((i, day) in relative.withIndex()) {
        if (i == 0) continue

        pre += day
        println(pre)
    }
}

fun solveTessokuBookB06() {
    val n = readInt()
    val a = readInts()
    val q = readInt()

    val aSum = mutableListOf<Int>()
    for ((i, ai) in a.withIndex()) {
        if (i == 0) {
            aSum.add(ai)
        } else {
            aSum.add(aSum[aSum.lastIndex] + ai)
        }
    }

    repeat(q) {
        val (li, ri) = readInts()
        val times = ri - li + 1
        val win = if (li == 1) {
            aSum[ri - 1]
        } else {
            aSum[ri - 1] - aSum[li - 1 - 1]
        }

        val half = times.toDouble() / 2.0
        if (half < win.toDouble()) {
            println("win")
        } else if (half == win.toDouble()) {
            println("draw")
        } else if (half > win.toDouble()) {
            println("lose")
        }
    }
}

fun solveTessokuBookA06() {
    val (n, q) = readInts()
    val a = readInts()

    val aSum = mutableListOf<Int>()
    for ((i, ai) in a.withIndex()) {
        if (i == 0) {
            aSum.add(ai)
        } else {
            aSum.add(aSum[aSum.lastIndex] + ai)
        }
    }
    repeat(q) {
        val (li, ri) = readInts()
        if (li == 1) {
            println(aSum[ri - 1])
        } else {
            println(aSum[ri - 1] - aSum[li - 1 - 1])
        }
    }
}

fun solveTessokuBookA05() {
    val (n, k) = readInts()

    var cnt = 0
    for (red in 1..n) {
        for (blue in 1..n) {
            val white = k - red - blue
            if (white in 1..n) {
                cnt++
            }
        }
    }

    println(cnt)
}

fun solveTessokuBookB04() {
    val n = readString()
    println(n.toInt(2))
}

fun solveTessokuBookA04() {
    val n = readInt()
    println(n.toString(2).padStart(10, '0'))
}

fun solveTessokuBookB03() {
    val n = readInt()
    val a = readInts()
    for (i in 0 until n) {
        for (j in 0 until n) {
            for (k in 0 until n) {
                if (i == j || j == k || k == i) continue

                if (a[i] + a[j] + a[k] == 1000) {
                    println("Yes")
                    return
                }
            }
        }
    }
    println("No")
}

fun solveTessokuBookA03() {
    val (n, k) = readInts()
    val p = readInts()
    val q = readInts()

    var res = false
    for (pi in p) {
        for (qi in q) {
            if (pi + qi == k) {
                res = true
            }
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveTessokuBookB02() {
    val (a, b) = readInts()

    var res = false
    for (i in a..b) {
        if (100 % i == 0) {
            res = true
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveTessokuBookA02() {
    val (n, x) = readInts()
    val a = readInts()
    if (a.contains(x)) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveTessokuBookB01() {
    val (a, b) = readInts()
    println(a + b)
}

fun solveTessokuBookA01() {
    val n = readInt()
    println(n * n)
}
