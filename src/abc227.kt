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
    solveABC227A()
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