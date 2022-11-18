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
    solveABC233B()
}

fun solveABC233B() {
    val (l, r) = readInts()
    val s = readString()
    val left = s.substring(0 until l - 1)
    val mid = s.substring(l - 1 until r).reversed()
    val right = s.substring(r until s.length)
    println("$left$mid$right")
}

fun solveABC233A() {
    val (x, y) = readInts()
    if (x < y) {
        if ((y - x) % 10 == 0) {
            println((y - x) / 10)
        } else {
            println(((y - x) / 10) + 1)
        }
    } else {
        println("0")
    }
}