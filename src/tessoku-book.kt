import java.util.*
import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

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
    solveTessokuBookA18()
}

fun solveTessokuBookA18() {
    val (n, s) = readInts()
    val a = readInts()

    val dp = MutableList(n + 1) { MutableList(s + 1) { false } }

    for (i in 0 .. n) {
        for (j in 0 .. s) {
            if (i == 0) {
                dp[i][j] = (j == 0)
            } else {
                if (dp[i - 1][j]) {
                    // 1個前まででjにすることができるなら、選ばなければそのままjになる
                    dp[i][j] = true
                } else if (j - a[i - 1] >= 0 && dp[i - 1][j - a[i - 1]]) {
                    // 1個前まででj - a[i]にすることができるなら、選べばjになる
                    dp[i][j] = true
                }
            }
        }
    }

    println(if (dp[n][s]) "Yes" else "No")
}

fun solveTessokuBookB17() {
    val n = readInt()
    val h = readInts()

    val beforeRoute = MutableList(n + 1) { -1 }
    val dp = MutableList(n + 1) { Int.MAX_VALUE }

    beforeRoute[0] = -1
    beforeRoute[1] = -1
    dp[0] = 0
    dp[1] = 0

    for (i in 1 until n) {
        if (i + 1 <= n) {
            val plusOneCost = dp[i] + (h[i - 1] - h[i]).absoluteValue
            if (dp[i + 1] >= plusOneCost) {
                dp[i + 1] = plusOneCost
                beforeRoute[i + 1] = i
            }
        }
        if (i + 2 <= n) {
            val plusTwoCost = dp[i] + (h[i - 1] - h[i + 1]).absoluteValue
            if (dp[i + 2] >= plusTwoCost) {
                dp[i + 2] = plusTwoCost
                beforeRoute[i + 2] = i
            }
        }
    }

    var resList = mutableListOf<Int>()
    var i = n
    while (i != -1) {
        resList.add(i)
        i = beforeRoute[i]
    }

    println(resList.count())
    println(resList.reversed().joinToString(" "))
}

fun solveTessokuBookA17() {
    val n = readInt()
    val a = readInts()
    val b = readInts()

    val beforeRoute = MutableList(n + 1) { -1 }
    val dp = MutableList(n + 1) { Int.MAX_VALUE }

    beforeRoute[0] = -1
    beforeRoute[1] = -1
    beforeRoute[2] = 1
    dp[0] = 0
    dp[1] = 0
    dp[2] = dp[1] + a[0]

    for (i in 3..n) {
        // from i-1
        val fromMinusOne = dp[i - 1] + a[i - 2]

        // from i-2
        val fromMinusTwo = dp[i - 2] + b[i - 3]

        if (fromMinusOne <= fromMinusTwo) {
            beforeRoute[i] = i - 1
            dp[i] = fromMinusOne
        } else {
            beforeRoute[i] = i - 2
            dp[i] = fromMinusTwo
        }
    }

    val res = mutableListOf<Int>()
    var i = n
    while (i != -1) {
        res.add(i)
        i = beforeRoute[i]
    }

    println(res.count())
    println(res.reversed().joinToString(" "))
}

fun solveTessokuBookB16() {
    val n = readInt()
    val h = readInts()

    val dp = MutableList(n + 1) { Int.MAX_VALUE }
    dp[0] = 0
    dp[1] = 0

    for (i in 1 until n) {
        // i+1
        if (i + 1 <= n) {
            dp[i + 1] = min(dp[i + 1], dp[i] + (h[i] - h[i - 1]).absoluteValue)
        }

        // i+2
        if (i + 2 <= n) {
            dp[i + 2] = min(dp[i + 2], dp[i] + (h[i + 1] - h[i - 1]).absoluteValue)
        }
    }

    println(dp[n])
}

fun solveTessokuBookA16() {
    val n = readInt()
    val a = readInts()
    val b = readInts()

    val res = MutableList(n + 1) { Int.MAX_VALUE }
    res[0] = 0
    res[1] = 0

    for (i in 2..n) {
        val to = i
        val from1 = i - 1
        res[to] = min(res[to], res[from1] + a[i - 2])

        if (i >= 3) {
            val from2 = i - 2
            res[to] = min(res[to], res[from2] + b[i - 3])
        }
    }

    println(res[n])
}

fun solveTessokuBookA15() {
    // val n = readInt()
    // val a = readInts()

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = mutableListOf<Int>()
    for (i in 0 until n) {
        a.add(sc.nextInt())
    }

    val a2 = a.toSortedSet()

    val map = mutableMapOf<Int, Int>()
    for ((i, ai) in a2.withIndex()) {
        map[ai] = i + 1
    }

    val resList = mutableListOf<Int>()
    for (ai in a) {
        resList.add(map[ai]!!)
    }

    println(resList.joinToString(" "))
}

fun solveTessokuBookB14() {
    val (n, k) = readInts()
    val a = readInts()
    val a1 = a.subList(0, n / 2)
    val a2 = a.subList(n / 2, n)

    val half = n / 2
    val end = 2.0.pow(half).toInt()

    val p = mutableSetOf<Int>()
    val q = mutableSetOf<Int>()

    for (i in 0..end) {
        val bits = i.toString(2).padStart(end.toString(2).length - 1, '0').reversed()
        var tmp1 = 0
        var tmp2 = 0
        for ((i, bit) in bits.withIndex()) {
            if (bit == '1') {
                if (a1.lastIndex >= i) tmp1 += a1[i]
                if (a2.lastIndex >= i) tmp2 += a2[i]
            }
        }
        p.add(tmp1)
        q.add(tmp2)
    }

    for (pi in p) {
        val target = k - pi
        if (q.contains(target)) {
            println("Yes")
            return
        }
    }

    println("No")
}

fun solveTessokuBookA14() {
    val (n, k) = readInts()
    val a = readInts()
    val b = readInts()
    val c = readInts()
    val d = readInts()

    val p = mutableMapOf<Int, Int>()
    val q = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            p[a[i] + b[j]] = 1
            p[b[i] + a[j]] = 1
            q[c[i] + d[j]] = 1
            q[d[i] + c[j]] = 1
        }
    }

    for (pi in p) {
        val targetNum = k - pi.key
        if (q.containsKey(targetNum)) {
            println("Yes")
            return
        }
    }

    println("No")
}

fun solveTessokuBookB13() {
    val (n, k) = readInts()
    val a = readLongs()

    val sum = mutableListOf<Long>()
    for (ai in a) {
        sum.add(if (sum.isNotEmpty()) sum.last() + ai else ai)
    }

    var cnt = 0L
    for (i in 0 until n) {
        for (j in i until n) {
            if (sum[j] - (if (i == 0) 0 else sum[i - 1]) > k) {
                break
            }
            cnt++
        }
    }

    println(cnt)
}

fun solveTessokuBookA13() {
    val (n, k) = readInts()
    val a = readInts()

    var pointer = 0
    var res = 0L
    for (i in 0 until n) {
        for (j in pointer until n) {
            if (a[j] - a[i] <= k) {
                if (j == n - 1) {
                    res += (j + 1 - (i + 1))
                    pointer = j
                }
            } else {
                res += (j - (i + 1))
                pointer = j
                break
            }
        }
    }

    println(res)
}

fun solveTessokuBookB12() {
    val n = readDouble()

    var l = 0.0
    var r = n

    while (true) {
        var mid = (l + r) / 2
        val tmp = mid * mid * mid + mid
        if (tmp in n - 0.001..n + 0.001) {
            println(mid)
            return
        } else if (tmp < n - 0.001) {
            l = mid + 1
        } else if (tmp > n + 0.001) {
            r = mid - 1
        }
    }
}

fun solveTessokuBookA12() {
    val (n, k) = readLongs()
    val a = readLongs()

    var left = 1L
    var right = 10000000000
    var mid: Long

    while (left < right) {
        mid = (left + right) / 2

        var printCnt = 0L
        for (ai in a) {
            printCnt += (mid / ai)
        }
        if (printCnt >= k) {
            right = mid
        } else
            left = mid + 1
    }

    println(left)
}

private fun lowerBound(list: List<Int>, value: Int): Int {
    var left = 0
    var right = list.lastIndex
    while (left <= right) {
        val mid = (left + right) / 2
        if (list[mid] < value) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return left
}

fun solveTessokuBookB11() {
    val n = readInt()
    val a = readInts().sorted()
    val q = readInt()
    repeat(q) {
        val xi = readInt()
        println(lowerBound(a, xi))
    }
}

fun solveTessokuBookA11() {
    val (n, x) = readInts()
    val a = readInts()

    var start = 0
    var half = n / 2
    var end = a.lastIndex
    while (true) {
        val halfValue = a[half]

        if (end - start == 1) {
            if (x == a[start]) {
                println(start + 1)
            } else {
                println(end + 1)
            }
            return
        } else {
            if (x == halfValue) {
                println(half + 1)
                return
            } else if (x > halfValue) {
                start = half
                half += (end - start) / 2
            } else if (x < halfValue) {
                end = half
                half -= (end - start) / 2
            }
        }
    }
}

fun solveTessokuBookA10() {
    val n = readInt()
    val a = readInts()
    val aLeft = a.toMutableList()
    for (i in a.indices) {
        if (i != 0) {
            aLeft[i] = max(aLeft[i], aLeft[i - 1])
        }
    }
    val aRight = a.toMutableList()
    for (i in a.lastIndex downTo 0) {
        if (i != a.lastIndex) {
            aRight[i] = max(aRight[i], aRight[i + 1])
        }
    }

    val d = readInt()
    repeat(d) {
        val (li, ri) = readInts()
        val leftMax = if (li - 1 == 0) 0 else aLeft[li - 2]
        val rightMax = if (ri - 1 == aRight.lastIndex) 0 else aRight[ri]
        println(max(leftMax, rightMax))
    }
}

fun solveTessokuBookB09() {
    val n = readInt()
    val matrix = MutableList(size = 1502) { MutableList(size = 1502) { 0 } }
    repeat(n) {
        val (x1, y1, x2, y2) = readInts()
        matrix[x1][y1] += 1
        matrix[x2][y2] += 1
        matrix[x2][y1] -= 1
        matrix[x1][y2] -= 1
    }

    for (i in 0..1500) {
        for (j in 0..1500) {
            matrix[i][j] += if (i == 0) 0 else matrix[i - 1][j]
        }
    }

    for (j in 0..1500) {
        for (i in 0..1500) {
            matrix[i][j] += if (j == 0) 0 else matrix[i][j - 1]
        }
    }

    var res = 0
    for (i in 0..1500) {
        for (j in 0..1500) {
            if (matrix[i][j] > 0) {
                res++
            }
        }
    }

    println(res)
}

fun solveTessokuBookA09() {
    val (h, w, n) = readInts()

    val defaultValue = 0
    val matrix = MutableList(size = h + 2) { MutableList(size = w + 2) { defaultValue } }
    repeat(n) {
        val (x1, y1, x2, y2) = readInts()
        matrix[x1][y1] += 1
        matrix[x2 + 1][y2 + 1] += 1
        matrix[x2 + 1][y1] -= 1
        matrix[x1][y2 + 1] -= 1
    }

    // x方向累積
    for (i in 1..h) {
        for (j in 1..w) {
            matrix[i][j] += matrix[i - 1][j]
        }
    }

    // y方向累積
    for (j in 1..w) {
        for (i in 1..h) {
            matrix[i][j] += matrix[i][j - 1]
        }
    }

    for (i in 1..h) {
        for (j in 1..w) {
            print("${matrix[i][j]} ")
        }
        println()
    }
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
