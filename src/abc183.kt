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
    solveABC183B()
}

fun solveABC183B() {
    val (sx, sy, gx, gy) = readDoubles()

    // (a,b), (c,d)の直線の傾き
    // -> d-b / c-a

    // 傾きa = x - sx / 0 - sy
    // 傾きb = gx - x / gy - 0
    // a = -b
    // -> x - sx / 0 - sy = -(gx - x /  gy - 0)
    // -> ...
    // -> x = (sy * gx + gy * sx) / (gy + sy)

    println((sy * gx + gy * sx) / (gy + sy))
}

fun solveABC183A() {
    val x = readInt()
    if (x >= 0) {
        println(x)
    } else {
        println(0)
    }
}