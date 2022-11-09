import kotlin.math.max

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
    solveABC258B()
}

fun solveABC258B() {
    val n = readInt()
    val a = mutableListOf<MutableList<String>>()
    for (i in 0 until n) {
        val ai = readString()
        val tmp = mutableListOf<String>()
        for (cell in ai) {
            tmp.add(cell.toString())
        }
        a.add(tmp)
    }

    var res = 0L
    for (i in 0 until n) {
        for (j in 0 until n) {
            // i,j の±1の範囲を探す
            for (ii in i - 1..i + 1) {
                for (jj in j - 1..j + 1) {
                    if (i == ii && j == jj) continue

                    var tmp = ""
                    var xMove = if (i < ii) -1 else if (i == ii) 0 else 1
                    var yMove = if (j < jj) -1 else if (j == jj) 0 else 1
                    var x = ii
                    var y = jj
                    for (k in 0 until n) {
                        // 循環ありの場合の座標を取得
                        val xDash = if (x == -1) n - 1 else if (x == n) 0 else x
                        val yDash = if (y == -1) n - 1 else if (y == n) 0 else y
                        tmp += a[xDash][yDash]

                        // 次の座標へ移動
                        x = xDash + xMove
                        y = yDash + yMove
                    }

                    res = max(res, tmp.toLong())
                }
            }
        }
    }

    println(res)
}

fun solveABC258A() {
    val k = readInt()
    var hh = 21
    var mm = 0
    for (i in 1..k) {
        mm++
        if (mm == 60) {
            hh++
            mm = 0
        }
    }
    println("$hh:${mm.toString().padStart(2, '0')}")
}