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
    solveABC245B()
}

fun solveABC245B() {
    val n = readInt()
    val a = readInts()

    for (i in 0..2000) {
        if (i !in a) {
            println(i)
            return
        }
    }
}

fun solveABC245A() {
    val (a, b, c, d) = readInts()
    if (a < c) {
        println("Takahashi")
    } else if (a == c) {
        if (b <= d) {
            println("Takahashi")
        } else {
            println("Aoki")
        }
    } else {
        println("Aoki")
    }
}