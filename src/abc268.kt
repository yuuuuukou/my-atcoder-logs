import kotlin.math.max
import kotlin.math.sqrt

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC268C()
}

// WA
fun solveABC268C() {
    val n = readInt()
    val p = readInts()

    var res = 0
    for (opeCnt in 0 until sqrt(n.toDouble()).toInt()) {
        var happyCnt = 0
        for (i in 0 until n) {
            // 操作opeCnt回、人iは喜ぶか？
            val currentIndex = if (i - opeCnt >= 0) i - opeCnt else n + (i - opeCnt)
            val nextIndex = (currentIndex + 1) % n
            val prevIndex = if (currentIndex == 0) (n - 1) else (currentIndex - 1)
            if (p[currentIndex] == i || p[nextIndex] == i || p[prevIndex] == i) {
                happyCnt++
            }
        }
        res = max(res, happyCnt)
    }
    println(res)
}

fun solveABC268B() {
    val s = readLn()
    val t = readLn()

    if (t.startsWith(s)) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC268A() {
    val (a, b, c, d, e) = readInts()
    val map = mutableMapOf<Int, Int>()
    map[a] = 1
    map[b] = 1
    map[c] = 1
    map[d] = 1
    map[e] = 1

    var cnt = 0
    for (item in map) {
        cnt++
    }

    println(cnt)
}
