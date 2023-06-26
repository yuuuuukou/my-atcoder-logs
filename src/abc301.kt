import kotlin.math.absoluteValue

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
    solveABC301C()
}

fun solveABC301C() {
    val s = readString()
    val t = readString()

    val sMap = mutableMapOf<Char, Int>()
    for (si in s) {
        sMap[si] = (sMap[si] ?: 0) + 1
    }
    val tMap = mutableMapOf<Char, Int>()
    for (ti in t) {
        tMap[ti] = (tMap[ti] ?: 0) + 1
    }

    var difference = 0
    for (c in 'a'..'z') {
        var tmpDiff = ((sMap[c] ?: 0) - (tMap[c] ?: 0)).absoluteValue
        if ((sMap[c] ?: 0) < (tMap[c] ?: 0)) {
            // s側で不足、@で補填できるか確認
            if (c in arrayOf('a', 't', 'c', 'o', 'd', 'e', 'r')) {
                if ((sMap['@'] ?: 0) >= tmpDiff) {
                    sMap['@'] = (sMap['@'] ?: 0) - tmpDiff
                    tmpDiff = 0
                }
            }
        } else if ((sMap[c] ?: 0) == (tMap[c] ?: 0)) {
            // ok
        } else if ((sMap[c] ?: 0) > (tMap[c] ?: 0)) {
            // t側で不足、@で補填できるか確認
            if (c in arrayOf('a', 't', 'c', 'o', 'd', 'e', 'r')) {
                if ((tMap['@'] ?: 0) >= tmpDiff) {
                    tMap['@'] = (tMap['@'] ?: 0) - tmpDiff
                    tmpDiff = 0
                }
            }
        }

        difference += tmpDiff
    }

    if (difference == 0) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC301B() {
    val n = readInt()
    val a = readInts()

    val res = StringBuilder()
    for (i in a.indices) {
        if (i == a.lastIndex) {
            res.append("${a[i]}")
        } else {
            res.append("${a[i]} ")
            if ((a[i] - a[i + 1]).absoluteValue > 1) {
                if (a[i] < a[i + 1]) {
                    for (j in a[i] + 1 until a[i + 1]) {
                        res.append("$j ")
                    }
                } else {
                    for (j in a[i] - 1 downTo a[i + 1] + 1) {
                        res.append("$j ")
                    }
                }
            }
        }
    }

    println(res)
}

fun solveABC301A() {
    val n = readInt()
    val s = readString()

    var takahashiWin = 0
    var aokiWin = 0
    for (si in s) {
        if (si == 'T') takahashiWin++
        if (si == 'A') aokiWin++

        if (n % 2 == 0) {
            if (takahashiWin == n / 2) {
                println("T")
                return
            } else if (aokiWin == n / 2) {
                println("A")
                return
            }
        }
    }

    println(if (takahashiWin > aokiWin) "T" else "A")
}