fun main(args: Array<String>) {
    solveABC061B()
}

fun solveABC061B() {
    // n: 都市数、 m: 道路数
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val resMap = mutableMapOf<Int, Int>()
    for (i in 0 until m) {
        // a　<-> b のパス
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        resMap[a] = (resMap[a] ?: 0) + 1
        resMap[b] = (resMap[b] ?: 0) + 1
    }

    for (i in 1..n) {
        println(resMap[i] ?: 0)
    }
}