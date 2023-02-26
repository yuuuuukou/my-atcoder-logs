import kotlin.math.absoluteValue

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
        solveABC253B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC253B() {
    val (h, w) = readInts()

    val s = mutableListOf<String>()
    repeat(h) {
        s.add(readString())
    }

    val maru = mutableListOf<Pair<Int, Int>>()
    for ((i, si) in s.withIndex()) {
        for ((j, sij) in si.withIndex()) {
            if (sij == 'o') {
                maru.add(Pair(i, j))
            }
        }
    }

    println(
        (maru[0].first - maru[1].first).absoluteValue
                + (maru[0].second - maru[1].second).absoluteValue
    )
}

fun solveABC253A() {
    val abc = readInts()
    if (abc[1] == abc.sorted()[1]) {
        println("Yes")
    } else {
        println("No")
    }
}
