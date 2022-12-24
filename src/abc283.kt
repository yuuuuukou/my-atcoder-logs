import kotlin.math.pow

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
    solveABC283E()
}

fun solveABC283E() {
    val (h, w) = readInts()
    val a = mutableListOf<MutableList<Int>>()
    repeat(h) {
        val ai = readInts()
        a.add(ai)
    }

    // diff[0] = 0行目と1行目の差の数
    // 多いものを転置していく
    val diff = mutableListOf<Int>()
    for (i in 0 until h - 1) {
        var cnt = 0
        for (j in 0 until w) {
            if (a[i] == a[i + 1]) {

            } else {
                cnt++
            }
        }
        diff[i] = cnt
    }

    while (true) {
        // 孤立チェック
        var isIsolate = false
        for (i in 0 until h) {
            for (j in 0 until w) {
                if (i == 0 && j == 0) {
                    if (a[i][j] == a[i+1][j] || a[i][j] == a[i][j+1]) {
                        // ok
                    } else {
                        // ng
                        isIsolate = true
                    }
                } else if (i == 0 && j == w-1) {
                    if (a[i][j] == a[i-1][j] || a[i][j] == a[i+1][j]) {
                        // ok
                    } else {
                        // ng
                        isIsolate = true
                    }
                } else if (i == 0 && j == w-1) {
                    if (a[i][j] == a[i-1][j] || a[i][j] == a[i+1][j]) {
                        // ok
                    } else {
                        // ng
                        isIsolate = true
                    }
                }
            }
        }

        var target = -1
        val diffMax = diff.max()
        for ((i, diffI) in diff.withIndex()) {
            if (diffI == diffMax) {
                val prev = if (i - 1 > 0) diff[i - 1] else -1
                val next = if (i + 1 <= diff.lastIndex) diff[i + 1] else -1

                if (prev == -1) {
                    target = i
                } else {
                    if (next == -1) {
                        target = i - 1
                    } else {
                        if (prev < next) {
                            target = i + 1
                        } else {
                            target = i
                        }
                    }
                }
            }
        }

        // targetを転置
        val targetLine = a[target]
        val inverse = mutableListOf<Int>()
        for (aij in a[target]) {
            inverse.add(if (aij == 0) 1 else 0)
        }
        a[target] = inverse
    }
}

fun solveABC283D() {
    val s = readString()

    var box = mutableMapOf<Char, Int>()
    for (si in s) {
        when (si) {
            '(' -> {}
            ')' -> {
                box = mutableMapOf()
            }
            else -> {
                if (box.containsKey(si)) {
                    println("No")
                    return
                } else {
                    box[si] = 1
                }
            }
        }
    }

    println("Yes")
}

fun solveABC283C() {
    val s = readString()

    var cnt = 0
    var i = 0

    while (i < s.lastIndex) {
        if (s[i] == '0' && s[i + 1] == '0') {
            cnt++
            i += 2
        } else {
            cnt++
            i++
        }
    }

    // lastIndex
    // 最後に0が偶数個・・・cnt不要
    // 奇数個・・・要cnt
    var lastZeroCnt = 0
    for (i in s.lastIndex downTo 0) {
        if (s[i] == '0') {
            lastZeroCnt++
        } else {
            break
        }
    }
    if (lastZeroCnt == 0) {
        cnt++
    } else {
        if (lastZeroCnt % 2 == 0) {

        } else {
            cnt++
        }
    }

    println(cnt)
}

fun solveABC283B() {
    val n = readInt()
    val a = readInts()
    val q = readInt()
    repeat(q) {
        val qi = readInts()
        when (qi[0]) {
            1 -> {
                a[qi[1] - 1] = qi[2]
            }
            2 -> {
                println(a[qi[1] - 1])
            }
        }
    }
}

fun solveABC283A() {
    val (a, b) = readDoubles()
    println(a.pow(b).toInt())
}