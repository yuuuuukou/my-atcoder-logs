import kotlin.math.sqrt

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
    solveABC279D()
}

fun solveABC279D() {
    val (a, b) = readDoubles()

    var g = 1.0

    // 素直に落下
    val sunao = a / sqrt(g)

    var from = 0

    // 素直に落下する時間/詠唱時間 の回数だけgを増加する可能性があるはず
    var to = (sunao / b).toInt()

    while (true) {
//        var leftG = 1 + from
//        var leftSousaTime = from * b
//        val leftRakkaTime = leftSousaTime + (a / sqrt(leftG.toDouble()))
//
//        var rightG = 1 + to
//        var rightSousaTime = from * b
//        val rightRakkaTime = rightSousaTime + (a / sqrt(rightG.toDouble()))

        var mid = (to - from) / 2
        var midG = 1 + mid
        var midSousaTime = mid * b
        val midRakkaTime = midSousaTime + (a / sqrt(midG.toDouble()))

        var midMinusOne = mid - 1
        var midMinusOneG = 1 + midMinusOne
        var midMinusOneSousaTime = midMinusOne * b
        val midMinusOneRakkaTime = midMinusOneSousaTime + (a / sqrt(midMinusOneG.toDouble()))

        var midPlusOne = mid + 1
        var midPlusOneG = 1 + midPlusOne
        var midPlusOneSousaTime = midPlusOne * b
        val midPlusOneRakkaTime = midPlusOneSousaTime + (a / sqrt(midPlusOneG.toDouble()))

//        if (midRakkaTime <= midMinusOneRakkaTime && midRakkaTime <= midPlusOneRakkaTime) {
//            // 谷部分、ここが極値のはず
//            println(midRakkaTime)
//            return
//        } else if (midRakkaTime <= midMinusOneRakkaTime && midRakkaTime >= midPlusOneRakkaTime) {
//            // 右下がり、もっと右側に極値がありそう
//            from = mid // 始点を右側に寄せる
//        } else if (midRakkaTime >= midMinusOneRakkaTime && midRakkaTime <= midPlusOneRakkaTime) {
//            // 右上がり、もっと左側に極値がありそう
//            to = mid // 終点を左側に寄せる
//        } else {
//            println("想定外")
//        }

        if (midRakkaTime <= midMinusOneRakkaTime) {
            // 左側は右下がり
            if (midRakkaTime < midPlusOneRakkaTime) {
                // 右側は右上がり
                // -> 谷部分、ここが極値のはず
                println(midRakkaTime)
                return
            } else if(midRakkaTime > midPlusOneRakkaTime) {
                // 右側は右下がり
                // -> 右下がり、もっと右側に極値がありそう
                from = mid // 始点を右側に寄せる
            } else {
                // とりあえずずらしてみる
                from += mid
            }
        } else {
            // 左側は右上がり
            if (midRakkaTime < midPlusOneRakkaTime) {
                // 右側は右上がり
                // -> 右上がり、もっと左側に極値がありそう
                to = mid // 終点を左側に寄せる
            } else if (midRakkaTime > midPlusOneRakkaTime) {
                // 右側は右下がり
                // -> 山部分、とりあえずずらしてみる
                from += mid
            } else {
                // とりあえずずらしてみる
                from += mid
            }
        }
    }
}

fun solveABC279C() {
    val (h, w) = readInts()

    val s = mutableListOf<String>()
    repeat(h) {
        val si = readString()
        s.add(si)
    }
    val t = mutableListOf<String>()
    repeat(h) {
        val ti = readString()
        t.add(ti)
    }

    val s2 = mutableMapOf<String, Int>()
    val t2 = mutableMapOf<String, Int>()
    // 欲しい形、転置する
    // s[0][0] + s[1][0] + s[2][0] + s[h][0]
    // s[0][1] + s[1][1] + s[2][1] + s[h][1]
    // s[0][w] + s[1][w] + s[2][w] + s[h][w]
    for (i in 0 until w) {
        val tmpS = StringBuilder()
        val tmpT = StringBuilder()
        for (j in 0 until h) {
            tmpS.append(s[j][i])
            tmpT.append(t[j][i])
        }
        val tmpS2 = tmpS.toString()
        val tmpT2 = tmpT.toString()
        s2[tmpS2] = (s2[tmpS2] ?: 0) + 1
        t2[tmpT2] = (t2[tmpT2] ?: 0) + 1
    }

    for (item in s2) {
        if (item.value == t2[item.key]) {
            // ok
        } else {
            println("No")
            return
        }
    }
    println("Yes")
}

fun solveABC279B() {
    val s = readString()
    val t = readString()

    if (s.contains(t)) println("Yes") else println("No")
}

fun solveABC279A() {
    val s = readString()
    var cnt = 0
    for (si in s) {
        if (si.toString() == "w") {
            cnt += 2
        } else {
            cnt += 1
        }
    }
    println(cnt)
}
