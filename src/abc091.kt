import kotlin.math.max

fun main(args: Array<String>) {
    solveABC091B()
}

fun solveABC091B() {
    val map = mutableMapOf<String, Int>()

    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val ni = readLine()!!
        map[ni] = (map[ni] ?: 0) + 1
    }

    val m = readLine()!!.toInt()
    for (i in 0 until m) {
        val mi = readLine()!!
        map[mi] = (map[mi] ?: 0) - 1
    }

    // 負数となる場合はリストに存在しない言葉を選べばよいためmax0で最大値を判定する
    var res = 0
    for (item in map) {
        res = max(res, item.value)
    }

    println(res)
}