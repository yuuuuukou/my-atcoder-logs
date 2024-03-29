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
    solveABC226B()
}

fun solveABC226B() {
    val n = readInt()

    var set = mutableSetOf<String>()
    repeat(n) {
        val li = readInts()
        li.removeAt(0)
        set.add(li.joinToString(", "))
    }

    println(set.count())
}

fun solveABC226A() {
    val x = readBigDecimal()
    println(x.setScale(0, RoundingMode.HALF_UP))
}