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
    Thread(null, {
        solveABC293D()
    }, "solve", 1.shl(26)).start()
}

private class UnionFind {
    val parentNode: MutableList<Int>
    val groupSize: MutableList<Int>

    constructor(n: Int) {
        parentNode = MutableList(n) { -1 }
        groupSize = MutableList(n) { 1 }
    }

    /**
     * 根を求める
     */
    fun root(x: Int): Int {
        return if (parentNode[x] == -1) {
            x // x が根の場合は x を返す
        } else {
            root(parentNode[x])
        }
    }

    /**
     * x と y が同じグループに属するかどうか
     * (根が一致するかどうか)
     */
    fun isSameGroup(x: Int, y: Int): Boolean {
        return root(x) == root(y)
    }

    /**
     * x を含むグループと y を含むグループとを併合する
     */
    fun unite(x: Int, y: Int): Boolean {
        // x, y をそれぞれ根まで移動する
        val xx = root(x)
        val yy = root(y)

        // すでに同じグループのときは何もしない
        if (xx == yy) return false

        // union by size (y 側のサイズが小さくなるようにする)
        if (groupSize[xx] < groupSize[yy]) {
            parentNode[xx] = yy
            groupSize[yy] = groupSize[yy] + groupSize[xx]
        } else {
            parentNode[yy] = xx
            groupSize[xx] = groupSize[xx] + groupSize[yy]
        }
        return true
    }

    /**
     * x を含むグループのサイズ
     */
    fun size(x: Int): Int {
        return groupSize[root(x)]
    }

    /**
     * このUnionFind内のグループの個数
     */
    fun groupCount(): Int {
        return parentNode.count { it == -1 }
    }
}

fun solveABC293D() {
    val (n, m) = readInts()

    val uf = UnionFind(2 * n + 1)

    for (i in 1..n) {
        // 1 1-red
        // 2 1-blue
        // 3 2-red
        // 4 2-red
        // :
        uf.unite(2 * i - 1, 2 * i)
    }

    var cycleCnt = 0

    repeat(m) {
        val (ai, bi, ci, di) = readStrings()

        if (bi == "R") {
            if (di == "R") {
                if (!uf.unite(2 * ai.toInt() - 1, 2 * ci.toInt() - 1)) {
                    cycleCnt++
                }
            } else {
                if (!uf.unite(2 * ai.toInt() - 1, 2 * ci.toInt())) {
                    cycleCnt++
                }
            }
        } else {
            if (di == "R") {
                if (!uf.unite(2 * ai.toInt(), 2 * ci.toInt() - 1)) {
                    cycleCnt++
                }
            } else {
                if (!uf.unite(2 * ai.toInt(), 2 * ci.toInt())) {
                    cycleCnt++
                }
            }
        }
    }

    println("$cycleCnt ${uf.groupCount() - 1 - cycleCnt}")
}

fun solveABC293C() {
    val (h, w) = readInts()

    val a = mutableListOf<MutableList<Int>>()
    repeat(h) {
        a.add(readInts())
    }

    var cnt = 0
    fun solve(i: Int, j: Int, h: Int, w: Int, a: MutableList<MutableList<Int>>, seen: MutableSet<Int>) {
        if (seen.contains(a[i - 1][j - 1])) {
            return
        }
        seen.add(a[i - 1][j - 1])
        if (i == h && j == w) {
            cnt++
            return
        } else if (i == h) {
            solve(i, j + 1, h, w, a, seen.toMutableSet())
        } else if (j == w) {
            solve(i + 1, j, h, w, a, seen.toMutableSet())
        } else {
            solve(i, j + 1, h, w, a, seen.toMutableSet())
            solve(i + 1, j, h, w, a, seen.toMutableSet())
        }
    }

    val seen = mutableSetOf<Int>()
    solve(1, 1, h, w, a, seen)

    println(cnt)
}

fun solveABC293B() {
    val n = readInt()
    val a = readInts()

    val called = mutableSetOf<Int>()
    for ((i, ai) in a.withIndex()) {
        if (!called.contains(i + 1)) {
            called.add(ai)
        }
    }

    println(n - called.count())
    for (i in 0 until n) {
        if (!called.contains(i + 1)) {
            print("${i + 1} ")
        }
    }
}

fun solveABC293A() {
    val s = readString()

    val res = mutableListOf<String>()
    for (si in s) {
        res.add(si.toString())
    }

    for (i in 1..s.length / 2) {
        val tmp = res[2 * i - 1 - 1]
        res[2 * i - 1 - 1] = res[2 * i - 1]
        res[2 * i - 1] = tmp
    }

    println(res.joinToString(""))
}