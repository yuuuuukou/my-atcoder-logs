import kotlin.math.max

fun main(args: Array<String>) {
    solveZone2021D()
}

fun solveZone2021D() {
    val s = readLine()!!

    var t = ""
    for (i in 0 until s.length) {
        if (s[i].toString() == "R") {
            t = t.reversed()
        } else {
            t += s[i].toString()
        }
    }

    var i = 1
    while (t.length > i) {

        var loopCnt = 0
        if (t[i - 1] == t[i]) {
            // ダブってるので消す
            t = t.removeRange(i - 1, i + 1)

            val tmp = remove(t, i - 1 - 1, i - 1, 0)
            t = tmp.first
            loopCnt = tmp.second
        }

        if (loopCnt > 0) {
            i -= loopCnt
        } else {
            i++
        }
    }
    println(t)
}

fun remove(s: String, targetA: Int, targetB: Int, loopCnt: Int): Pair<String, Int> {
    if (s == "") {
        return Pair("", loopCnt)
    }
    if (s[targetA] == s[targetB]) {
        // ダブってるので消す
        return remove(s.removeRange(targetA, targetB + 1), targetA - 1, targetB - 1, loopCnt + 1)
    }
    return Pair(s, loopCnt)
}

fun solveZone2021B() {
    // n: 遮蔽物の個数
    // d: UFOの距離
    // h: UFOの高さ
    val (n, d, h) = readLine()!!.split(" ").map { it.toDouble() }

    var result = 0.toDouble()
    for (i in 0 until n.toInt()) {
        // di:i件目の遮蔽物の距離
        // hi:i件目の遮蔽物の高さ
        val (di, hi) = readLine()!!.split(" ").map { it.toDouble() }

        // 傾き
        val a = (h - hi) / (d - di)

        // h = a * d + b
        // b = h - a * d
        val b = h - (a * d)

        result = max(result, b)
    }
    println(result)
}

fun solveZone2021A() {
    val s = readLine()!!

    var cnt = 0
    var pre1 = ""
    var pre2 = ""
    var pre3 = ""
    var pre4 = ""
    for (i in 0 until s.length) {
        pre4 = pre3
        pre3 = pre2
        pre2 = pre1
        pre1 = s[i].toString()
        if ("$pre4$pre3$pre2$pre1" == "ZONe") {
            cnt++
        }
    }
    println(cnt)
}
