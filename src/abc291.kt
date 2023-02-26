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

fun main(args: Array<String>) {
    Thread(null, {
        solveABC291D()
    }, "solve", 1.shl(26)).start()
}

fun solveABC291D() {
    val n = readInt()

    // 直前の座標が何本分経路を持っているか
    var (cntA, cntB) = arrayOf(1L, 1L)
    // 直前の座標
    var (preA, preB) = readLongs()
    repeat(n - 1) {
        val (ai, bi) = readLongs()

        // preA 1  preB 2
        // ai   4  bi   2

        var tmpCntA = 0L
        var tmpCntB = 0L
        if (preA != ai) {
            // preAから来てaiを通るルートを数える
            tmpCntA += cntA
        }
        if (preB != ai) {
            // preBから来てaiを通るルートを数える
            tmpCntA += cntB
        }
        if (preA != bi) {
            // preAから来てbiを通るルートを数える
            tmpCntB += cntA
        }
        if (preB != bi) {
            // preBから来てbiを通るルートを数える
            tmpCntB += cntB
        }

        preA = ai
        preB = bi
        cntA = tmpCntA % 998244353
        cntB = tmpCntB % 998244353
    }

    println((cntA + cntB) % 998244353)
}

//fun solveABC291D() {
//    val n = readInt()
//
//    // 直前の座標が何本分経路を持っているか
//    var (cntA, cntB) = arrayOf("1".toBigDecimal(), "1".toBigDecimal())
//    // 直前の座標
//    var (preA, preB) = readBigDecimals()
//    repeat(n - 1) {
//        val (ai, bi) = readBigDecimals()
//
//        var tmpCntA = "0".toBigDecimal()
//        var tmpCntB = "0".toBigDecimal()
//        if (preA != ai) {
//            // preAから来てaiを通るルートを数える
//            tmpCntA += cntA
//        }
//        if (preB != ai) {
//            // preBから来てaiを通るルートを数える
//            tmpCntA += cntB
//        }
//        if (preA != bi) {
//            // preAから来てbiを通るルートを数える
//            tmpCntB += cntA
//        }
//        if (preB != bi) {
//            // preBから来てbiを通るルートを数える
//            tmpCntB += cntB
//        }
//
//        preA = ai
//        preB = bi
//        cntA = tmpCntA
//        cntB = tmpCntB
//    }
//
//    println((cntA + cntB).remainder("998244353".toBigDecimal()))
//}

fun solveABC291C() {
    val n = readInt()
    val s = readString()

    val map = mutableMapOf<String, Int>()
    var current = Pair(0, 0)
    map["${current.first}_${current.second}"] = 1

    for (si in s) {
        // 移動
        when (si) {
            'R' -> current = Pair(current.first + 1, current.second)
            'L' -> current = Pair(current.first - 1, current.second)
            'U' -> current = Pair(current.first, current.second + 1)
            'D' -> current = Pair(current.first, current.second - 1)
        }

        // チェック
        if (map["${current.first}_${current.second}"] == 1) {
            println("Yes")
            return
        } else {
            map["${current.first}_${current.second}"] = 1
        }
    }

    println("No")
}

fun solveABC291B() {
    val n = readInt()
    val x = readInts().sorted()

    var sum = 0
    for (i in 0 + n..x.lastIndex - n) {
        sum += x[i]
    }

    println(sum.toDouble() / (5 * n - 2 * n))
}

fun solveABC291A() {
    val s = readString()
    for ((i, si) in s.withIndex()) {
        if (si.toString().toUpperCase() == si.toString()) {
            println(i + 1)
        }
    }
}