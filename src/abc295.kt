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
    solveABC295C()
}

fun solveABC295C() {
    val n = readInt()
    val a = readInts()

    val map = mutableMapOf<Int, Int>()
    for (ai in a) {
        map[ai] = (map[ai] ?: 0) + 1
    }
    var cnt = 0
    for (item in map) {
        cnt += item.value / 2
    }

    println(cnt)
}

fun solveABC295B() {
    val (r, c) = readInts()
    val b = mutableListOf<CharArray>()
    repeat(r) {
        b.add(readString().toCharArray())
    }

    for (row in 0 until r) {
        for (col in 0 until c) {
            val cell = b[row][col].toString()
            if (cell in "1".."9") {
                for (i in 0 until r) {
                    for (j in 0 until c) {
                        // 爆弾は先に消しちゃうと爆発処理が漏れるので処理するタイミングで消しこむ
                        if ((row != i || col != j) && b[i][j].toString() in "1".."9") continue

                        if ((row - i).absoluteValue + (col - j).absoluteValue <= cell.toInt()) {
                            b[i][j] = '.'
                        }
                    }
                }
            }
        }
    }

    for (i in 0 until r) {
        println(b[i].joinToString(""))
    }
}

fun solveABC295A() {
    val n = readInt()
    val w = readStrings()
    val list = arrayOf("and", "not", "that", "the", "you")

    for (wi in w) {
        if (list.contains(wi)) {
            println("Yes")
            return
        }
    }

    println("No")
}
