private fun readString() = readLine()!!
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
    solveABC228C()
}

fun solveABC228C() {
    val (n, k) = readInts()

    val scores = mutableListOf<Int>()
    repeat(n) {
        val (pi1, pi2, pi3) = readInts()

        scores.add(pi1 + pi2 + pi3)
    }

    val sortedScores = scores.toMutableList().sortedDescending()
    val kthScore = sortedScores[k - 1]

    for (score in scores) {
        if (score + 300 >= kthScore) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun solveABC228B() {
    val (n, x) = readInts()
    val a = readInts()

    val map = mutableMapOf<Int, Int>()
    map[x] = 1
    var current = x
    while (true) {
        val next = a[current - 1]

        if (map[next] ?: 0 == 1) {
            // 循環
            break
        }

        map[next] = 1
        current = next
    }

    println(map.count())
}

fun solveABC228A() {
    val (s, t, x) = readInts()

    if (s < t) {
        if (x in s until t) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        val t2 = t + 24
        val x2 = x + 24
        if (x in s until t2 || x2 in s until t2) {
            println("Yes")
        } else {
            println("No")
        }
    }
}