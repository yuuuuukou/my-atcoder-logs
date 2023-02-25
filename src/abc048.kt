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
        solveABC048B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC048B() {
    val (a, b, x) = readLongs()
    if (a == 0L) {
        if (b == 0L) {
            println(1)
        } else {
            println(b / x + 1)
        }
    } else {
        println(b / x - (a - 1) / x)
    }
}

fun solveABC048A() {
    val (a, b, c) = readLine()!!.split(" ")

    print("${a.first()}${b.first()}${c.first()}")
}
