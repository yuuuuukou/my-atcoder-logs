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
        solveABC287C()
    }, "solveABC287C", 1.shl(26)).start()
}

fun solveABC287C() {
    val (n, m) = readInts()

    val map = mutableMapOf<Int, MutableMap<Int, Int>>()
    // 孤立ノード無し、次数1のノードが2つ、次数2のノードが0以上
    repeat(m) {
        val (vi, ui) = readInts()
        val tmp = map[vi] ?: mutableMapOf()
        tmp[ui] = 1
        map[vi] = tmp
        val tmp2 = map[ui] ?: mutableMapOf()
        tmp2[vi] = 1
        map[ui] = tmp2
    }

    var d1Cnt = 0
    var d2Cnt = 0
    var edgeNode = -1
    for (i in 1..n) {
        if (map.containsKey(i)) {
            when (map[i]!!.count()) {
                1 -> {
                    d1Cnt++
                    edgeNode = i
                }
                2 -> {
                    d2Cnt++
                }
                else -> {
                    println("No")
                    return
                }
            }
        } else {
            println("No")
            return
        }
    }
    if (edgeNode == -1) {
        println("No")
        return
    }

    try {
        // 全nodeが連結しているかチェック
        var nodes = mutableMapOf<Int, Int>()
        nodes[edgeNode] = 1
        solve(edgeNode, map, nodes)
        if (nodes.count() != n) {
            println("No")
            return
        }
    } catch (e: Exception) {
        println("No")
        return
    }

    if (d1Cnt == 2) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solve(node: Int, map: MutableMap<Int, MutableMap<Int, Int>>, nodes: MutableMap<Int, Int>) {
    // nodeのlink取得
    var linkNodes = map[node]
    if (linkNodes == null) {
        return
    } else {
        for (item in linkNodes) {
            if (nodes.containsKey(item.key)) {
                continue
            } else {
                nodes[item.key] = 1
                solve(item.key, map, nodes)
            }
        }
    }
}

fun solveABC287B() {
    val (n, m) = readInts()
    val s = mutableListOf<String>()
    val t = mutableListOf<String>()
    repeat(n) {
        var tmp = readString()
        s.add(tmp.substring(tmp.lastIndex - 2..tmp.lastIndex))
    }
    repeat(m) {
        t.add(readString())
    }
    var cnt = 0
    for (si in s) {
        if (t.contains(si)) {
            cnt++
        }
    }
    println(cnt)
}

fun solveABC287A() {
    val n = readInt()
    var cnt = 0
    repeat(n) {
        if (readString() == "For") {
            cnt++
        }
    }
    if (n / 2 < cnt) {
        println("Yes")
    } else {
        println("No")
    }
}
