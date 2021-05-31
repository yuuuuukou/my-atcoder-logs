fun main(args: Array<String>) {
    solveABC203C()
}

// FIXME:TLE
fun solveABC203C() {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }

    val a = mutableMapOf<Long, Long>()

    for (i in 0 until n) {
        val (ai, bi) = readLine()!!.split(" ").map { it.toLong() }

        val tmp1 = (a[ai] ?: 0L)
        a[ai] = (a[ai] ?: 0L) + bi
    }

    var money = k
    var totalCost = money
    var village = 0L

    while (money > 0) {
        val friendsMoney = a.filterKeys { key -> key in village + 1..totalCost }.values.sum()

        village += money
        money = friendsMoney
        totalCost += friendsMoney
    }

    println(village)
}

fun solveABC203B() {
    // n階建て
    // 各階K質
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }

    var sum = 0L
    for (ni in 1..n) {
        for (ki in 1..k) {
            val s = "${ni}0${ki}"
            sum += s.toLong()
        }
    }

    println(sum)
}

fun solveABC203A() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    if (a == b && b == c) {
        println(a)
    } else if (a == b) {
        println(c)
    } else if (a == c) {
        println(b)
    } else if (b == c) {
        println(a)
    } else {
        println(0)
    }
}
