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
    solveABC267B()
}

fun solveABC267B() {
    val s = readString()

    if (s[0].toString() == "0") {
        val exist = mutableListOf<Int>()
        exist.add(s[6].toString().toInt())
        exist.add(s[3].toString().toInt())
        exist.add(max(s[0].toString().toInt(), s[4].toString().toInt()))
        exist.add(max(s[1].toString().toInt(), s[7].toString().toInt()))
        exist.add(max(s[2].toString().toInt(), s[8].toString().toInt()))
        exist.add(s[5].toString().toInt())
        exist.add(s[9].toString().toInt())

        if (exist.sum() == 1) {
            println("No")
        } else {
            var res = "No"
            for ((i, col) in exist.withIndex()) {
                if (col == 0) {
                    // ブランク列を中心にして左右に立ってる列があるかチェック
                    var left = 0
                    for (j in 0 until i) {
                        left += exist[j]
                    }
                    var right = 0
                    for (j in i + 1 until 7) {
                        right += exist[j]
                    }
                    if (left > 0 && right > 0) {
                        res = "Yes"
                        break
                    }
                }
            }
            println(res)
        }
    } else {
        println("No")
    }
}

fun solveABC267A() {
    when (readString()) {
        "Monday" -> println(5)
        "Tuesday" -> println(4)
        "Wednesday" -> println(3)
        "Thursday" -> println(2)
        "Friday" -> println(1)
    }
}