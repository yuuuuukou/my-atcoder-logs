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
    solveABC252B()
}

fun solveABC252B() {
    val (n, k) = readInts()
    val a = readInts()
    val aMax = a.max()
    val b = readInts()

    val deliciousList = mutableListOf<Int>()
    for ((i, ai) in a.withIndex()) {
        if (ai == aMax) {
            deliciousList.add(i + 1)
        }
    }
    var res = "No"
    for (item in deliciousList) {
        if (b.contains(item)) {
            res = "Yes"
        }
    }
    println(res)
}

fun solveABC252A() {
    val n = readInt()
    println(n.toChar().toString())
}