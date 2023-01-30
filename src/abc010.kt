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
    solveABC010B()
}

fun solveABC010B() {
    val n = readInt()
    val a = readInts()

    var sum = 0
    for (ai in a) {
        for (num in ai downTo 1) {
            if (num % 2 == 0 || num % 3 == 2) {
                // ng
                sum++
            } else {
                // ok
                break
            }
        }
    }

    println(sum)
}

fun solveABC010A() {
    println(readString() + "pp")
}