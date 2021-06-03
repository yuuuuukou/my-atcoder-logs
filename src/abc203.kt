fun main(args: Array<String>) {
    solveABC203C()
}

fun solveABC203C() {
    var (n, k) = readLine()!!.split(" ").map { it.toLong() }

    val friends = mutableListOf<Pair<Long, Long>>()

    for (i in 0 until n) {
        val (ai, bi) = readLine()!!.split(" ").map { it.toLong() }

        friends.add(Pair(ai, bi))
    }

    friends.sortBy { it.first }

    for (i in 0 until n) {
        // 直近の友達 friends[i.toInt()].first が 所持金 k より遠くにいるならそこで終わり
        if (friends[i.toInt()].first > k) {
            break
        }

        k += friends[i.toInt()].second
    }

    println(k)
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
