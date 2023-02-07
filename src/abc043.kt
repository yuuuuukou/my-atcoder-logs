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
    Thread(null, {
        solveABC043B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC043B() {
    val s = readString()

    var res = StringBuilder()
    for (si in s) {
        when (si) {
            '0' -> res.append("0")
            '1' -> res.append("1")
            'B' -> {
                if (res.isNotEmpty()) {
                    res.deleteCharAt(res.lastIndex)
                }
            }
        }
    }

    println(res)
}

fun solveABC043A() {
    val n = readInt()

    var sum = 0
    for (i in 0 until n) {
        sum += i + 1
    }

    println(sum)
}