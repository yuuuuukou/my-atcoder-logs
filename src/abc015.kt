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
    solveABC015B()
}

fun solveABC015B() {
    val n = readInt()
    val a = readInts()

    var cnt = 0
    var sum = 0
    for (ai in a) {
        if (ai != 0) {
            cnt++
            sum += ai
        }
    }

    println(if (sum % cnt == 0) sum / cnt else sum / cnt + 1)
}

fun solveABC015A() {
    val a = readString()
    val b = readString()

    if (a.length < b.length) {
        println(b)
    } else {
        println(a)
    }
}