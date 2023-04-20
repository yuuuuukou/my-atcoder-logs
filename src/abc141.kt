private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC141C()
}

fun solveABC141C() {
    val (n, k, q) = readInts()

    val cnt = Array(100001) { 0 }
    repeat(q) {
        val ai = readInt()

        cnt[ai] += 1
    }

    for (i in 1..n) {
        // 減点数(問題数-得点数)が保有ポイント内におさまればラウンド突破
        if (q - cnt[i] < k) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun solveABC141B() {
    val s = readLn()

    var res = true
    for ((i, si) in s.withIndex()) {
        if (i % 2 == 0) {
            if (si !in arrayOf('R', 'U', 'D')) {
                res = false
            }
        } else {
            if (si !in arrayOf('L', 'U', 'D')) {
                res = false
            }
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveABC141A() {
    val s = readLn()
    if (s == "Sunny") {
        println("Cloudy")
    } else if (s == "Cloudy") {
        println("Rainy")
    } else if (s == "Rainy") {
        println("Sunny")
    }
}
