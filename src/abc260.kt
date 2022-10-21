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
    solveABC260A()
}

fun solveABC260A() {
    val s = readString()
    if (s[0] != s[1] && s[0] != s[2]) {
        println(s[0].toString())
        return
    }
    if (s[1] != s[0] && s[1] != s[2]) {
        println(s[1].toString())
        return
    }
    if (s[2] != s[0] && s[2] != s[1]) {
        println(s[2].toString())
        return
    }
    println(-1)
}