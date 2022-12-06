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
    solveABC280C()
}

fun solveABC280C() {
    val s = readString()
    val t = readString()
    for (i in t.indices) {
        if (i == t.lastIndex) {
            println(i + 1)
            return
        }

        if (s[i] == t[i]) {
            // ok
        } else {
            println(i + 1)
            return
        }
    }
}

fun solveABC280B() {
    val n = readLong()
    val s = readLongs()

    var pre = 0L
    for (si in s) {
        print("${si - pre} ")
        pre = si
    }
}

fun solveABC280A() {
    val (h, w) = readInts()

    var cnt = 0
    repeat(h) {
        val si = readString()
        for (sij in si) {
            if (sij.toString() == "#") {
                cnt++
            }
        }
    }

    println(cnt)
}
