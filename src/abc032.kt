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
    solveABC032B()
}

fun solveABC032B() {
    val s = readString()
    val k = readInt()

    if (s.length < k) {
        println(0)
    } else if (s.length == k) {
        println(1)
    } else {
        val map = mutableMapOf<String, Int>()
        for (startIndex in s.indices) {
            if (startIndex + k - 1 > s.lastIndex) {
                continue
            } else {
                map[s.substring(startIndex..startIndex + k - 1)] = 1
            }
        }
        println(map.count())
    }
}

fun solveABC032A() {
    val a = readInt()
    val b = readInt()
    var n = readInt()
    while (true) {
        if (n % a == 0 && n % b == 0) {
            break
        }

        n++
    }

    println(n)
}