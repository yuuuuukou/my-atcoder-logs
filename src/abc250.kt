import kotlin.math.absoluteValue

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
    solveABC250B()
}

fun solveABC250B() {
    val (n, a, b) = readInts()

    // タイル 縦A行 * 横B列
    // 角タイルを 縦N行 * 横N列 で並べる

    var res = StringBuilder()
    for (row in 0 until a * n) {
        for (col in 0 until b * n) {
            // row 1,2,3 and col 1,2 = .
            // row 1,2,3 and col 3,4 = #
            // row 1,2,3 and col 5,6 = .
            // row 1,2,3 and col 7,8 = #

            // row 5,6,7 and col 1,2 = #
            // row 5,6,7 and col 3,4 = .
            // row 5,6,7 and col 5,6 = #
            // row 5,6,7 and col 7,8 = .


            if ((row / a) % 2 == 0) {
                if ((col / b) % 2 == 0) {
                    res.append(".")
                } else {
                    res.append("#")
                }
            } else {
                if ((col / b) % 2 == 0) {
                    res.append("#")
                } else {
                    res.append(".")
                }
            }
        }
        res.append("\n")
    }

    println(res)
}

fun solveABC250A() {
    val (h, w) = readInts()
    val (r, c) = readInts()

    var cnt = 0
    for (row in 1..h) {
        for (col in 1..w) {
            if ((row - r).absoluteValue + (col - c).absoluteValue == 1) {
                cnt++
            }
        }
    }

    println(cnt)
}