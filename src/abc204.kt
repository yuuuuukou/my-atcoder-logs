fun main(args: Array<String>) {
    solveABC204C()
}

fun solveABC204C() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val routes = mutableMapOf<Int, MutableList<Int>>()
    for (mi in 0 until m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }

        val temp = routes[a] ?: mutableListOf()
        temp.add(b)
        routes[a] = temp
    }

    var cnt = 0
    val countMap = mutableMapOf<Int, Int>()
    val searchedMap = mutableMapOf<Int, Boolean>()
    for (i in 1..n) {
        cnt += countReachableRoute(routes, i, countMap, searchedMap)
    }

    println(cnt)
}

fun countReachableRoute(
    routes: MutableMap<Int, MutableList<Int>>,
    startPoint: Int,
    countMap: MutableMap<Int, Int>,
    searchedMap: MutableMap<Int, Boolean>
): Int {
    // 既に探索済みなら探索結果をそのまま返却
    if (searchedMap.containsKey(startPoint)) {
        return countMap[startPoint] ?: 0
    }
    // 探索済みとする
    searchedMap[startPoint] = true

    // 始点から移動可能なリストを取得
    val route = routes[startPoint]

    // 到達可能なノードを数える
    var cnt = 0
    if (route.isNullOrEmpty()) {
        // 自身のみ
        countMap[startPoint] = 1
        cnt++
    } else {
        for (r in route) {
            cnt += countReachableRoute(routes, r, countMap, searchedMap)
        }
        countMap[startPoint] = cnt
    }

    return cnt
}

fun solveABC204B() {
    /*val n = */readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    for (ai in a) {
        if (ai > 10) {
            cnt += (ai - 10)
        }
    }

    println(cnt)
}

fun solveABC204A() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }

    if (x == y) {
        println(x)
    } else {
        if (x == 0 && y == 1 || x == 1 && y == 0) {
            println("2")
        } else if (x == 0 && y == 2 || x == 2 && y == 0) {
            println("1")
        } else if (x == 1 && y == 2 || x == 2 && y == 1) {
            println("0")
        }
    }
}
