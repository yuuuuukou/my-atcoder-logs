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
    solveABC050B()
}

fun solveABC050B() {
    val n = readInt()
    val t = readInts()
    val m = readInt()

    repeat(m) {
        val (pi, xi) = readInts()

        var sum = 0L
        for ((i, ti) in t.withIndex()) {
            sum += if (i + 1 == pi) xi else ti
        }
        println(sum)
    }
}

fun solveABC050A() {
    val (a, op, b) = readLine()!!.split(" ")

    if (op == "+") {
        println(a.toInt() + b.toInt())
    } else if (op == "-") {
        println(a.toInt() - b.toInt())
    }
}