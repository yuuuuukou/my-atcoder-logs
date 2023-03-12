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


fun solveABC293D() {
    val (n, m) = readInts()

    val map = mutableMapOf<String, MutableSet<String>>()

    for (i in 1..n) {
        val tmp = map["${i}R"] ?: mutableSetOf()
        tmp.add("${i}B")
        map["${i}R"] = tmp

        val tmp2 = map["${i}B"] ?: mutableSetOf()
        tmp2.add("${i}R")
        map["${i}B"] = tmp2
    }

    repeat(m) {
        val (ai, bi, ci, di) = readStrings()

        val tmp = map["${ai}${bi}"] ?: mutableSetOf()
        tmp.add("${ci}${di}")
        map["${ai}${bi}"] = tmp

        val tmp2 = map["${ci}${di}"] ?: mutableSetOf()
        tmp2.add("${ai}${bi}")
        map["${ci}${di}"] = tmp2
    }

    // 1Rから辿ってどこまで行けるか
    // 到達できる範囲はグループ内
    // グループ内に1Rとリンクするnodeが2つあればサイクル
    var x = 0
    var y = 0
    val seen = mutableSetOf<String>()
    fun solve(node: String, prev: String, start: String, map: MutableMap<String, MutableSet<String>>, seen:MutableSet<String>) {
        if (seen.contains(node)) {
            return
        }
        if (node == start && prev != start) {
            x++
            seen.add(node)
            return
        }
        if (map[node]!!.count() == 1) {
            // for (item in map[node]) {
            //     if (item == prev) {
            //         y++
            //         return
            //     }
            // }
            y++
            seen.add(node)
            return
        }

        for (next in map[node]!!) {
            if (next == prev) {
                continue
            }

            solve(next, node, start, map, seen)
        }
    }

    for (i in 1..m) {
        solve("${i}R", "", "${i}R", map, seen)
    }

    println("$x $y")
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