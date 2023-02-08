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
    solveABC019B()
}

fun solveABC019B() {
    val s = readString()

    var res = ""
    var pre = ""
    var cnt = 0
    for (si in s) {
        if (pre == si.toString()) {
            cnt++
        } else {
            if (cnt != 0) {
                res += pre
                res += cnt
            }

            cnt = 1
            pre = si.toString()
        }
    }
    res += pre
    res += cnt

    println(res)
}

fun solveABC019A() {
    println(readInts().sorted()[1])
}