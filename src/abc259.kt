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
    solveABC259A()
}

fun solveABC259A() {
    // n歳で t cm
    // x歳までは d cm/年 ずつ伸びた
    // x .. n歳は伸びてない
    // ではm歳の時は？
    val (n, m, x, t, d) = readInts()
    if (m >= x) {
        // x歳以降であればtcm
        println(t)
    } else {
        // d * 年数 cm小さいはず
        println(t - (d * (x - m)))
    }
}