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
    solveABC304A()
}

fun solveABC304A() {
    val n = readInt()

    var min = Int.MAX_VALUE
    val s = mutableListOf<String>()
    val a = mutableListOf<Int>()
    repeat(n) {
        val (si, ai) = readStrings()
        s.add(si)
        a.add(ai.toInt())

        min = kotlin.math.min(min, ai.toInt())
    }

    var print = false
    for (i in 0 until n) {
        if (a[i] == min) print = true

        if (print) {
            println(s[i])
        }
    }
    for (i in 0 until n) {
        if (a[i] == min) return

        println(s[i])
    }
}