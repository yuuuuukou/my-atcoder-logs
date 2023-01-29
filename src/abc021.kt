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
    solveABC021B()
}

fun solveABC021B() {
    val n = readInt()
    val (a, b) = readInts()
    val k = readInt()
    val p = readInts()

    val map = mutableMapOf<Int, Int>()
    map[a] = (map[a] ?: 0) + 1
    map[b] = (map[b] ?: 0) + 1
    for (pi in p) {
        map[pi] = (map[pi] ?: 0) + 1
    }
    for (item in map) {
        if (item.value >= 2) {
            println("NO")
            return
        }
    }
    println("YES")
}

fun solveABC021A() {
    val n = readInt()
    println(n)
    for (i in 0 until n) {
        println(1)
    }
}