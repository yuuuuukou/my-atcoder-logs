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
    solveABC281D()
}

fun solveABC281D() {
    val (n, k, d) = readInts()
    val a = readInts()
    val aSorted = a.sorted()
    val aSortedDsc = a.sortedDescending()

    // 探索の上限を確認
    // (大きい方からk個選んだ時の値が上限値となるはず)
    var limit = 0
    for (i in 0 until n) {
        if (i < k) {
            limit += aSortedDsc[i]
        } else {
            break
        }
    }

    // 答えとして取りうる値を探索
    for (i in limit downTo 1) {
        if (i % d == 0) {
            // iを作ることができるか判定


        }
    }

}

fun solveABC281C() {
    val (n, t) = readLongs()
    val a = readLongs()

    val tmp = t % a.sum()
    var range = 0L
    for ((i, ai) in a.withIndex()) {
        range += ai
        if (tmp in 0..range) {
            println("${i + 1} ${ai - (range - tmp)}")
            return
        }
    }
}

fun solveABC281B() {
    val s = readString()

    if (s.length == 8) {
        if (s.substring(0..0) in "A".."Z"
            && s.substring(1..s.length - 2) in "100000".."999999"
            && s.substring(s.length - 1..s.length - 1) in "A".."Z"
        ) {
            println("Yes")
        } else {
            println("No")
        }
    } else {
        println("No")
    }
}

fun solveABC281A() {
    val n = readInt()


    val list = mutableListOf<Int>()
    for (i in n downTo 0) {
        println(i)
    }
}
