fun main(args: Array<String>) {
    solveABC263C()
}

fun solveABC263C() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    dfs(mutableListOf(), n, m)
}

fun dfs(a: MutableList<Int>, n: Int, m: Int) {
    if (a.size == n) {
        println(a.joinToString(" "))
        return
    }
    val start = if (a.size == 0) {
        1
    } else {
        a[a.lastIndex] + 1
    }

    for (i in start until m + 1) {
        val aDash = mutableListOf<Int>()
        aDash.addAll(a)
        aDash.add(i)
        dfs(aDash, n, m)
    }
}

fun solveABC263B() {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()
    for (i in 0 until n - 1) {
        // i==0 人2の親
        map[i + 2] = p[i]
    }

    println(getAncestor(map, n))

}

fun getAncestor(map: MutableMap<Int, Int>, n: Int): Int {
    if (map[n] == null) {
        return 0
    } else {
        return 1 + getAncestor(map, map[n]!!)
    }

}

fun solveABC263A() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()

    for (item in input) {
        map[item] = (map[item] ?: 0) + 1
    }

    if (map.size == 2) {
        for (item in map) {
            if (item.value == 2 || item.value == 3) {
                println("Yes")
                return
            } else {
                println("No")
                return
            }
        }
    } else {
        println("No")
        return
    }
}
