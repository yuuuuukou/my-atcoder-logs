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
    solveABC231C()
}

fun solveABC231C() {
    val (n, q) = readInts()
    val a = readInts()

    /**
     * ref: https://webbibouroku.com/Blog/Article/cs-lowerbound-upperbound
     */
    fun lowerBound(list: List<Int>, value: Int): Int {
        var left = 0
        var right = list.lastIndex
        while (left <= right) {
            val mid = (left + right) / 2
            if (list[mid] < value) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return left
    }

    val sortedA = a.toMutableList().sorted()

    repeat(q) {
        println(sortedA.lastIndex - lowerBound(sortedA, readInt()) + 1)
    }
}

fun solveABC231B() {
    val n = readInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        var tmp = readString()
        map[tmp] = (map[tmp] ?: 0) + 1
    }
    println(map.maxBy { it.value }?.key)
}

fun solveABC231A() {
    val d = readDouble()
    println(d / 100)
}