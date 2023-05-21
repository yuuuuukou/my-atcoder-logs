import kotlin.math.absoluteValue

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC224C()
}

fun solveABC224C() {
    val n = readInt()

    val list = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (xi, yi) = readInts()
        list.add(Pair(xi, yi))
    }

    var cnt = 0
    for (i in 0 until n) {
        for (j in i until n) {
            for (k in j until n) {
                if (i == j || j == k || k == i) continue

                val ans =
                    1.0 / 2.0 * (
                            (list[i].first - list[k].first) * (list[j].second - list[k].second)
                                    - (list[j].first - list[k].first) * (list[i].second - list[k].second)
                            ).absoluteValue
                if (ans > 0) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}

fun solveABC224B() {
    val (h, w) = readInts()
    val matrix = mutableListOf<MutableList<Long>>()
    repeat(h) {
        val ai = readLongs()
        matrix.add(ai)
    }

    for (i1 in 0 until h) {
        for (i2 in 0 until h) {
            for (j1 in 0 until w) {
                for (j2 in 0 until w) {
                    if (i1 < i2 || j1 < j2) continue

                    if (matrix[i1][j1] + matrix[i2][j2] <= matrix[i2][j1] + matrix[i1][j2]) {
                        // ok
                    } else {
                        println("No")
                        return
                    }
                }
            }
        }
    }

    println("Yes")
}

fun solveABC224A() {
    val s = readString()
    if (s.endsWith("er")) {
        println("er")
    } else {
        println("ist")
    }
}