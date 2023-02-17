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
    solveABC051B()
}

fun solveABC051B() {
    val (k, s) = readInts()

    var cnt = 0
    for (x in 0..k) {
        for (y in 0..k) {
            val z = s - (x + y)
            if (z in 0..k) {
                cnt++
            }
        }
    }

    println(cnt)
}

fun solveABC051A() {
    val s = readString()

    println(s.replace(",", " "))
}
