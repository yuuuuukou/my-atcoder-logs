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
    solveABC023B()
}

fun solveABC023B() {
    val n = readInt()
    val s = readString()

    var i = 1
    var tmp = "b"
    if (tmp == s) {
        println(0)
        return
    }
    while (tmp.length <= n) {
        when (i % 3) {
            1 -> {
                tmp = "a" + tmp + "c"
            }
            2 -> {
                tmp = "c" + tmp + "a"
            }
            0 -> {
                tmp = "b" + tmp + "b"
            }
        }

        if (tmp == s) {
            println(i)
            return
        }

        i++
    }

    println(-1)
}

fun solveABC023A() {
    val x = readString()
    println(x[0].toString().toInt() + x[1].toString().toInt())
}