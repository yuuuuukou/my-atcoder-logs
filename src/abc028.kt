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
    solveABC028B()
}

fun solveABC028B() {
    val s = readString()
    print("${s.count { it == 'A' }} ")
    print("${s.count { it == 'B' }} ")
    print("${s.count { it == 'C' }} ")
    print("${s.count { it == 'D' }} ")
    print("${s.count { it == 'E' }} ")
    print("${s.count { it == 'F' }}")
    println()
}

fun solveABC028A() {
    when (readInt()) {
        in 0..59 -> println("Bad")
        in 60..89 -> println("Good")
        in 90..99 -> println("Great")
        100 -> println("Perfect")
    }
}