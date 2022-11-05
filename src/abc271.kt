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
    solveABC271B()
}

fun solveABC271B() {
    val (n, q) = readInts()
    val list = mutableListOf<MutableList<Int>>()
    repeat(n) {
        val tmp = readInts()
        list.add(tmp)
    }
    repeat(q) {
        val (s, t) = readInts()
        println(list[s - 1][t])
    }
}

fun solveABC271A() {
    val n = readInt()

    val a = n / 16
    val b = n % 16

    println("${to16(a)}${to16(b)}")
}

private fun to16(x: Int): String {
    return when (x) {
        in 0..9 -> x.toString()
        10 -> "A"
        11 -> "B"
        12 -> "C"
        13 -> "D"
        14 -> "E"
        15 -> "F"
        else -> ""
    }
}