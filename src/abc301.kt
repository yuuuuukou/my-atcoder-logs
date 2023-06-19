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
    solveABC301A()
}

fun solveABC301A() {
    val n = readInt()
    val s = readString()

    var takahashiWin = 0
    var aokiWin = 0
    for (si in s) {
        if (si == 'T') takahashiWin++
        if (si == 'A') aokiWin++

        if (n % 2 == 0) {
            if (takahashiWin == n / 2) {
                println("T")
                return
            } else if (aokiWin == n / 2) {
                println("A")
                return
            }
        }
    }

    println(if (takahashiWin > aokiWin) "T" else "A")
}