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
    solveABC012B()
}

fun solveABC012B() {
    val n = readInt()
    val hh = n / (60 * 60)
    val mm = (n % (60 * 60)) / 60
    val ss = (n % 60)
    println("${hh.toString().padStart(2, '0')}:" +
            "${mm.toString().padStart(2, '0')}:" +
            "${ss.toString().padStart(2, '0')}")
}

fun solveABC012A() {
    val (a, b) = readInts()
    println("$b $a")
}