private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main() {
    solveABC181C()
}

fun solveABC181C() {
    val n = readInt()

    val xy = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (xi, yi) = readInts()
        xy.add(Pair(xi, yi))
    }

    // 直線判定
    // (y3 - y1) / (x3 - x1) = (y2 - y1) / (x2 - x1)
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                if (
                    xy[i].first == xy[j].first && xy[i].second == xy[j].second
                    || xy[j].first == xy[k].first && xy[j].second == xy[k].second
                    || xy[k].first == xy[i].first && xy[k].second == xy[i].second
                ) {
                    continue
                }

                val tmp1 = (xy[k].second - xy[i].second).toDouble()
                val tmp2 = (xy[k].first - xy[i].first).toDouble()
                val tmp3 = (xy[j].second - xy[i].second).toDouble()
                val tmp4 = (xy[j].first - xy[i].first).toDouble()
                if (
//                    (xy[i].first == xy[j].first && xy[j].first == xy[k].first)
//                    || (xy[i].second == xy[j].second && xy[j].second == xy[k].second)
//                    || (tmp2 != 0.0 && tmp4 != 0.0 && tmp1 / tmp2 == tmp3 / tmp4)
                    tmp1 * tmp4 == tmp2 * tmp3
                ) {
                    println("Yes")
                    return
                }
            }
        }
    }

    println("No")
}

fun solveABC181B() {
    val n = readLine()!!.toLong()
    var cnt = 0L
    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        // 1 以上 x 以下の全ての整数の和
        // -> x * (x + 1) / 2
        cnt += (b * (b + 1) / 2 - a * (a - 1) / 2)
    }

    println(cnt)

    // TLE
//    val n = readLine()!!.toLong()
//    var cnt = 0L
//    for (i in 0 until n) {
//        val (from, to) = readLine()!!.split(" ").map { it.toLong() }
//        for (j in from .. to) {
//            cnt += j
//        }
//    }
//
//    println(cnt)
}

fun solveABC181A() {
    val n = readLine()!!.toInt()

    if (n % 2 == 0) {
        println("White")
    } else {
        println("Black")
    }
}
