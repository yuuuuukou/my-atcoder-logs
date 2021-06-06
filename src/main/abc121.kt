fun main(args: Array<String>) {
    solveABC121B()
}

private fun solveABC121B() {
    // n: ソースの数
    // i個目のソースの特徴: ai1, ai2, ,,, , aim
    // 整数b: b1, b2, ,,, , bm
    // 整数c
    val (n, m, c) = readLine()!!.split(" ").map { it.toInt() }

    val b = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    repeat(n) {
        val ai = readLine()!!.split(" ").map { it.toInt() }

        var sum = 0
        repeat(m) {
            sum += ai[it] * b[it]
        }
        sum += c

        if (sum > 0) {
            cnt++
        }
    }

    println(cnt)
}