import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

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
    solveABC234C()
}

fun solveABC234C() {
    val k = readLong()

    // 0  0000
    // 1  0002
    // 2  0020
    // 3  0022
    // 4  0200
    // 5  0202
    // 6  0220
    // 7  0222
    // 8  2000
    // 9  2002
    // 10 2020
    // 11 2022
    // 1桁目 2で割ったあまりが   0なら0             1なら2
    // 2桁目 4で割ったあまりが   0,1なら0           2,3なら2
    // 3桁目 8で割ったあまりが   0,1,2,3なら0       4,5,6,7なら2
    // i桁目 2^iで割ったあまりが 2^i/2より小さいなら0 2^i/2以上なら2
    var res = ""
    for (i in 1..100) {
        // i桁目
        val base = 2.0.pow(i).toLong()
        res = if (k % base < base / 2L) {
            "0$res"
        } else {
            "2$res"
        }
    }

    println(res.trimStart('0'))
}

fun solveABC234B() {
    val n = readInt()

    val xy = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = readInts()
        xy.add(x to y)
    }

    var res = 0.0
    for (i in 0 until n) {
        for (j in 0 until n) {
            val x1 = xy[i].first
            val y1 = xy[i].second
            val x2 = xy[j].first
            val y2 = xy[j].second

            val distance = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))

            res = max(res, distance)
        }
    }

    println(res)
}

fun solveABC234A() {
    val t = readLong()
    println(f(f(f(t) + t) + f(f(t))))
}

private fun f(t: Long): Long = t * t + 2 * t + 3