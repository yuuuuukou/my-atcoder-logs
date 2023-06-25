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
    solveABC306C()
}

fun solveABC306C() {
    val n = readInt()
    val a = readInts()

    val seenMap = mutableMapOf<Int, Int>()
    val indexMap = mutableMapOf<Int, Int>()
    for ((i, ai) in a.withIndex()) {
        seenMap[ai] = (seenMap[ai] ?: 0) + 1
        if (seenMap[ai] == 2) {
            indexMap[i + 1] = ai
        }
    }

    val res = StringBuilder()
    for (item in indexMap.toSortedMap()) {
        res.append("${item.value} ")
    }
    println(res)
}

fun solveABC306B() {
    val a = readInts()
    println(a.reversed().joinToString("").toBigInteger(2))
}

fun solveABC306A() {
    val n = readInt()
    val s = readString()

    for (si in s) {
        print("${si}${si}")
    }
}