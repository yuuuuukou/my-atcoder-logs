import kotlin.math.abs
import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC112A()
}

fun solveABC112C() {
    // --------------------------------------------------
    // ピラミッド
    // - 中心座標(Cx,Cy)
    // - 高さh
    // - 座標(x,y)の高度 max(h - |x - cx| - |y - cy|, 0)

    // 調査結果
    // - 1 <= n <= 100
    // - 0 <= xi,yi <= 100
    // - nの情報 i個目の情報 座標(xi, yi)の高度はhi

    // -> 中心座標と高さを求めたい
    // --------------------------------------------------
    data class Research(val x: Long, val y: Long, val h: Long)

    val n = readLine()!!.toInt()

    val researches = mutableListOf<Research>()
    for (i in 0 until n) {
        val (x, y, h) = readLine()!!.split(" ").map { it.toLong() }
        researches.add(Research(x, y, h))
    }

    for (cx in 0..100) {
        for (cy in 0..100) {
            for (research in researches) {
                // cx, cy を仮定してhを計算
                val h = abs(research.x - cx) + abs(research.y - cy) + research.h
                if (h >= 0) {
                    // 他の調査結果との整合を確認
                    var flag = true
                    for (ohterResearch in researches) {
                        if (ohterResearch.h != max(h - abs(ohterResearch.x - cx) - abs(ohterResearch.y - cy), 0)) {
                            flag = false
                        }
                    }
                    if (flag) {
                        println("$cx $cy $h")
                        return
                    }
                }
            }
        }
    }
}

fun solveABC112A() {
    val num = readInt()
    if (num == 1) {
        println("Hello World")
    } else {
        println(readInt() + readInt())
    }
}