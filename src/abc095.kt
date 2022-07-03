import kotlin.math.min

fun main(args: Array<String>) {
    solveABC095B()
}

fun solveABC095B() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    var remain = x
    var minCost = Int.MAX_VALUE
    for (i in 0 until n) {
        val mi = readLine()!!.toInt()
        remain -= mi
        minCost = min(minCost, mi)
        cnt++
    }

    while (remain >= minCost) {
        remain -= minCost
        cnt++
    }

    println(cnt)
}

fun solveABC095A() {
    val s = readLine()!!

    var cost = 700

    for (i in s.indices) {
        if (s[i].toString() == "o") {
            cost += 100
        }
    }

    println(cost)
}
