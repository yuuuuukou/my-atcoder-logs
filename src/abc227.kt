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
    solveABC227B()
}

fun solveABC227B() {
    val n = readInt()
    val s = readInts()

    var res = 0
    for (i in 0 until n) {
        var exists = false
        for (a in 1..1000) {
            for (b in 1..1000) {
                val area = 4 * a * b + 3 * a + 3 * b
                if (area == s[i]) {
                    exists = true
                }
            }
        }
        if (exists) {
            // ok
        } else {
            res++
        }
    }
    println(res)
}

fun solveABC227A() {
    val (n, k, a) = readInts()

    var now = a
    for (i in 1..k) {
        // 人nowに配る

        if (i == k) {
            // 配り終わり、break
            break
        }

        // 次のループで配る人nowを設定
        if (now == n) {
            now = 1
        } else {
            now++
        }
    }

    println(now)
}