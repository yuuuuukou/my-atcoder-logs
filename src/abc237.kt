import kotlin.math.pow

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
    solveABC237B()
}

fun solveABC237B() {
    val (h, w) = readInts()
    val a = mutableListOf<MutableList<Int>>()
    for (row in 0 until h) {
        val ai = readInts()
        a.add(ai)
    }

    // var res = StringBuilder()
    for (i in 0 until w) {
        for (j in 0 until h) {
            // res.append("${a[j][i]} ")
            print("${a[j][i]} ")
        }
        // res.removeSuffix(" ")
        // res.append("\n")
        println()
    }

    // println(res)
}

fun solveABC237A() {
    val n = readLong()
    if (n in (-2.0).pow(31.0).toLong() until (2.0).pow(31.0).toLong()) {
        println("Yes")
    } else {
        println("No")
    }
}