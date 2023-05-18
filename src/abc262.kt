fun main(args: Array<String>) {
    solveABC262C()
}

fun solveABC262C() {
    // a1 a2 a3 a4
    //  1  3  2  4
    // -----------
    // (i,j)
    // -> 1,4 -> a1, a4 -> 1, 4 -> min 1 = i, max 4 = j
    // -> 2,3 -> a2, a3 -> 3, 2 -> min 2 = i, max 3 = j
    // => indexと値が一致 or 交換可能の場合にcnt
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0L
    // 値とindexが同値
    val same = mutableSetOf<Pair<Int, Int>>()
    // 値とindexが異なる
    val different = mutableSetOf<Pair<Int, Int>>()
    for (i in 0 until n) {
        if (a[i] == i + 1) {
            cnt += same.count()
            same.add(Pair(i + 1, a[i]))
        } else {
            if (different.contains(Pair(a[i], i + 1))) {
                cnt++
            } else {
                different.add(Pair(i + 1, a[i]))
            }
        }
    }

    println(cnt)
}

fun solveABC262B() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val graph = mutableMapOf<Int, MutableList<Int>>()
    for (i in 0 until m) {
        val (ui, vi) = readLine()!!.split(" ").map { it.toInt() }
        if (graph[ui] == null) {
            val list = mutableListOf<Int>()
            graph[ui] = list
        }
        if (graph[vi] == null) {
            val list = mutableListOf<Int>()
            graph[vi] = list
        }
        graph[ui]?.add(vi)
        graph[vi]?.add(ui)
    }

    var cnt = 0
    for (node1 in 1..n) {
        val linkNodes = graph[node1]
        if (linkNodes != null) {
            for (node2 in linkNodes) {
                if (node2 > node1) {
                    val linkNodes2 = graph[node2]
                    if (linkNodes2 != null) {
                        for (node3 in linkNodes2) {
                            val linkNodes3 = graph[node3]
                            if (linkNodes3 != null && linkNodes3.contains(node1)) {
                                if (1 <= node1 && node1 < node2 && node2 < node3 && node3 <= n) {
                                    cnt++
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    println(cnt)
}

fun solveABC262A() {
    val y = readLine()!!.toInt()

    when {
        y % 4 == 0 -> {
            println(y + 2)
        }
        y % 4 == 1 -> {
            println(y + 1)
        }
        y % 4 == 2 -> {
            println(y)
        }
        else -> {
            println(y + 3)
        }
    }
}
