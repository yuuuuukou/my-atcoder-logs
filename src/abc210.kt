import java.util.ArrayDeque
import kotlin.math.max

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC210C()
}

fun solveABC210C() {
    val (n, k) = readInts()
    val c = readInts()

    var res = 0
    val queue = ArrayDeque<Int>()
    val map = mutableMapOf<Int, Int>()

    for (i in 0 until n) {
        // queueにenqueue、mapに追加
        queue.add(c[i])
        map[c[i]] = (map[c[i]] ?: 0) + 1

        // もしカウントがkを超えていれば、dequeue、dequeueした項目をmapから削除
        if (queue.count() > k) {
            if (map[queue.first] == 1) {
                map.remove(queue.first)
            } else {
                map[queue.first] = max((map[queue.first] ?: 0) - 1, 0)
            }
            queue.removeFirst()
        }

        // mapの種類をカウント
        res = max(res, map.count())
    }

    println(res)
}

fun solveABC210B() {
    val n = readInt()
    val s = readString()
    if (s.indexOf("1") % 2 == 0) {
        println("Takahashi")
    } else {
        println("Aoki")
    }
}

fun solveABC210A() {
    val (n, a, x, y) = readInts()
    if (n > a) {
        println(a * x + (n - a) * y)
    } else {
        println(n * x)
    }
}