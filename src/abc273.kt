import java.math.RoundingMode

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
    solveABC273B()
}

fun solveABC273B() {
    var (x, k) = readBigDecimals()

    for (i in 0 until k.toInt()) {
        val scale = -(i + 1)
        x = x.setScale(scale, RoundingMode.HALF_UP)
    }

    println(x.toLong())
}

fun solveABC273A() {
    val n = readInt()
    println(f(n))
}

private fun f(k: Int): Int {
    if (k == 0) {
        return 1
    }

    return k * f(k - 1)
}