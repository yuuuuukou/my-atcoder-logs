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
    solveABC235B()
}

fun solveABC235B() {
    val n = readInt()
    val h = readInts()

    var res = 0
    for (hi in h) {
        if (res < hi) {
            res = hi
        } else {
            break
        }
    }
    println(res)
}

fun solveABC235A() {
    val abc = readString()
    println(
        abc.toInt()
                + (abc[1].toString() + abc[2].toString() + abc[0].toString()).toInt()
                + (abc[2].toString() + abc[0].toString() + abc[1].toString()).toInt()
    )
}