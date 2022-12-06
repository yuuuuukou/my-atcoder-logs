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
    solveABC231A()
}

fun solveABC231B() {
    val n = readInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        var tmp = readString()
        map[tmp] = (map[tmp] ?: 0) + 1
    }
    println(map.maxBy { it.value }?.key)
}

fun solveABC231A() {
    val d = readDouble()
    println(d/100)
}