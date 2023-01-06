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
    solveABC064B()
}

fun solveABC064B() {
    val n = readInt()
    val a = readInts()

    println(a.max()!! - a.min()!!)
}

fun solveABC064A() {
    val rgb = readLine()!!.replace(" ", "").toInt()
    if (rgb % 4 == 0) {
        println("YES")
    } else {
        println("NO")
    }
}