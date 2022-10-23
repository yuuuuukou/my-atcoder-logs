import java.math.RoundingMode
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
    solveABC274C()
}

fun solveABC274D() {
    val (n, x, y) = readInts()
    val a = readInts()

    var tmpX = 0
    var tmpY = 0
    var xPlusList = mutableListOf<Int>()
    var xMinusList = mutableListOf<Int>()
    var yPlusList = mutableListOf<Int>()
    var yMinusList = mutableListOf<Int>()
    for (i in 0 until n) {
        if (i == 0) {
            tmpX = a[i]
        } else if (i % 2 == 0) {
            // とりあえずxに近づけてみる、数字も控えておく
            if (tmpX < x) {
                tmpX += a[i]
                xPlusList.add(a[i])
            } else {
                tmpX -= a[i]
                xMinusList.add(a[i])
            }
        } else {
            // とりあえずyに近づけてみる、数字も控えておく
            if (tmpY < y) {
                tmpY += a[i]
                yPlusList.add(a[i])
            } else {
                tmpY -= a[i]
                yMinusList.add(a[i])
            }
        }
    }

    if (tmpX == x && tmpY == y) {
        println("Yes")
    } else {
        var xOK = false
        var yOK = false

        if (tmpX == x) {
            xOK = true
        } else if (tmpX > x) {
            // tmpXの方が大きい、xMinusListの要素をplus側に持って行って調整できないか？
            for (item in xMinusList) {
                // plus側に持っていくので倍量変動する
                if (item * 2 == (tmpX - x)) {
                    // 移動できるものアリ
                    xOK = true
                    break
                }

                // あるいは入れ替えられないか
                for (item2 in xPlusList) {
                    if ((item - item2).absoluteValue == (tmpX - x).absoluteValue) {
                        xOK = true
                        break
                    }
                }
            }
        } else {
            // tmpXの方が小さい、xPlusListの要素をminus側に持って行って調整できないか？
            for (item in xPlusList) {
                // minus側に持っていくので倍量変動する
                if (item * 2 == (x - tmpX)) {
                    // 移動できるものアリ
                    xOK = true
                    break
                }

                // あるいは入れ替えられないか
                for (item2 in xMinusList) {
                    if ((item - item2).absoluteValue == (x - tmpX).absoluteValue) {
                        xOK = true
                        break
                    }
                }
            }
        }

        if (tmpY == y) {
            yOK = true
        } else if (tmpY > y) {
            // tmpYの方が大きい、yMinusListの要素をplus側に持って行って調整できないか？
            for (item in yMinusList) {
                // plus側に持っていくので倍量変動する
                if (item * 2 == (tmpY - y)) {
                    // 移動できるものアリ
                    yOK = true
                    break
                }

                // あるいは入れ替えられないか
                for (item2 in yPlusList) {
                    if ((item - item2).absoluteValue == (tmpY - y).absoluteValue) {
                        yOK = true
                        break
                    }
                }
            }
        } else {
            // tmpYの方が小さい、yPlusListの要素をminus側に持って行って調整できないか？
            for (item in yPlusList) {
                // minus側に持っていくので倍量変動する
                if (item * 2 == (y - tmpY)) {
                    // 移動できるものアリ
                    yOK = true
                    break
                }

                // あるいは入れ替えられないか
                for (item2 in yMinusList) {
                    if ((item - item2).absoluteValue == (y - tmpY).absoluteValue) {
                        yOK = true
                        break
                    }
                }
            }
        }

        if (xOK && yOK) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun solveABC274C() {
    val n = readInt()
    val a = readInts()
    reader.close()

    var nextChild = 1
    var depthMap = mutableMapOf<Int, Int>()

    for (ai in a) {
        if (ai == 1) {
            depthMap[ai] = 0
        }

        // アメーバaiが分裂
        val nextDepth = (depthMap[ai] ?: 0) + 1
        depthMap[++nextChild] = nextDepth
        depthMap[++nextChild] = nextDepth
    }

    var i = 1
    while (true) {
        if (depthMap[i] == null) {
            break
        }

        println(depthMap[i])
        i++
    }
}

fun solveABC274B() {
    val (h, w) = readInts()

    var cntMap = mutableMapOf<Int, Int>()

    // #なら箱が置かれている
    for (r in 1..h) {
        val row = readString()
        for ((index, cell) in row.withIndex()) {
            if (cell.toString() == "#") {
                cntMap[index] = (cntMap[index] ?: 0) + 1
            }
        }
    }

    var res = ""
    for (c in 0 until w) {
        res += cntMap[c] ?: 0
        if (c != w) {
            res += " "
        }
    }

    println(res)
}

fun solveABC274A() {
    val (a, b) = readBigDecimals()
    val res = b.divide(a, 3, RoundingMode.HALF_DOWN)
    println(res)
}