import kotlin.math.min
import kotlin.math.max

fun main(args: Array<String>) {
    solveABC095C()
}

fun solveABC095C() {
    val (a, b, c, x, y) = readLine()!!.split(" ").map { it.toInt() }

    var cost = Int.MAX_VALUE
    for (ai in 0..x) {
        // Aピザの枚数を全探索。必要になるABピザでまかなう必要があるAピザの枚数を逆算
        val ci = x - ai

        // ci枚分はBピザもまかなわれるので、Bピザ購入数を計算
        // (負数になる場合既に十分な量になってるのでBピザは不要(=0))
        val bi = max(y - ci, 0)

        // 金額を試算
        // ABピザは2枚で1枚分なので *2
        // BピザはABピザで買ってしまった方が安い可能性があるので、ABピザを購入したケースとminを取る
        val tmpCost = a * ai + min(b * bi, c * bi * 2) + c * ci * 2
        cost = min(cost, tmpCost)
    }
    println(cost)
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
