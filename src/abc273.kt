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
    solveABC273C()
}

fun solveABC273C() {
    val n = readInt()
    val a = readInts()
    val sortAndDistinctA = a.toMutableList().distinct().sorted()

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

    val map = mutableMapOf<Int, Int>()
    for ((i, ai) in a.withIndex()) {
        // Aiに関してAに含まれる整数のうちAiより大きいものの種類を数える

        // 例: in 1 2 2 7 8 8    sort distinct 1 2 7 8
        // - aiが2の場合、aiでlowerBoundする ①
        val tmp = lowerBound(sortAndDistinctA, ai)
        // - lastIndex - ①でAiより大きいものの種類が数えられる
        val tmp2 = sortAndDistinctA.lastIndex - tmp

        map[tmp2] = (map[tmp2] ?: 0) + 1
    }

    for (k in 0 until n) {
        println(map[k]?:0)
    }
}

fun solveABC273B() {
    var (x, k) = readBigDecimals()

    for (i in 0 until k.toInt()) {
        val scale = -(i + 1)
        x = x.setScale(scale, RoundingMode.HALF_UP)
    }

    println(x.toLong())
}

fun solveABC273A() {
    val n = readInt()
    println(f(n))
}

private fun f(k: Int): Int {
    if (k == 0) {
        return 1
    }

    return k * f(k - 1)
}