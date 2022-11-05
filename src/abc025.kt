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
    solveABC025A()
}

fun solveABC025A() {
    val s = readString()
    val n = readInt()

    val list = mutableListOf<String>()

    for (i in 0 until 5) {
        for (j in 0 until 5) {
            val string = "${s[i]}${s[j]}"
            list.add(string)
        }
    }

    list.sort()
    println(list[n - 1])
}