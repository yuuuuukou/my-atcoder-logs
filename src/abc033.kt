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
    solveABC033B()
}

fun solveABC033B() {
    val n = readInt()

    var sum = 0
    var maxNum = 0
    var maxCityName = ""
    repeat(n) {
        val (si, pi) = readStrings()
        if (maxNum < pi.toInt()) {
            maxNum = pi.toInt()
            maxCityName = si
        }
        sum += pi.toInt()
    }

    println(if (sum / 2 < maxNum) maxCityName else "atcoder")
}

fun solveABC033A() {
    val n = readString()
    if (n[0] == n[1] && n[0] == n[2] && n[0] == n[3]) {
        println("SAME")
    } else {
        println("DIFFERENT")
    }
}