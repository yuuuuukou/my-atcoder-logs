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
    solveABC018B()
}

fun solveABC018B() {
    var s = readString()
    val n = readInt()
    repeat(n) {
        val (l, r) = readInts()
        val tmp1 = if (l - 2 >= 0) s.substring(0..l - 2) else ""
        val tmp2 = s.substring(l - 1 until r).reversed()
        val tmp3 = if (r - 1 == s.lastIndex) "" else s.substring(r..s.lastIndex)
        s = tmp1 + tmp2 + tmp3
    }
    println(s)
}

fun solveABC018A() {
    val a = readInt()
    val b = readInt()
    val c = readInt()

    var aRank = 0
    var bRank = 0
    var cRank = 0

    if (a < b) {
        // a < b
        if (b < c) {
            // a < b < c
            aRank = 3
            bRank = 2
            cRank = 1
        } else {
            if (a < c) {
                // a < c < b
                aRank = 3
                bRank = 1
                cRank = 2
            } else {
                // c < a < b
                aRank = 2
                bRank = 1
                cRank = 3
            }
        }
    } else {
        // a > b
        if (b > c) {
            // a > b > c
            aRank = 1
            bRank = 2
            cRank = 3
        } else {
            if (a < c) {
                // c > a > b
                aRank = 2
                bRank = 3
                cRank = 1
            } else {
                // a > c > b
                aRank = 1
                bRank = 3
                cRank = 2
            }
        }
    }

    println(aRank)
    println(bRank)
    println(cRank)
}