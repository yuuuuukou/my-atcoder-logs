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
    solveABC303B()
}

fun solveABC303B() {
    val (n, m) = readInts()
    val set = mutableSetOf<MutableSet<Int>>()
    repeat(m) {
        val ai = readInts()
        for (j in 0 until n - 1) {
            set.add(mutableSetOf(ai[j], ai[j + 1]))
        }
    }
    var cnt = 0
    for (i in 1..n) {
        for (j in i + 1..n) {
            val checkTarget = mutableSetOf(i, j)
            if (!set.contains(checkTarget)) {
                cnt++
            }
        }
    }
    println(cnt)
}

fun solveABC303A() {
    val n = readInt()
    val s = readString()
    val t = readString()

    for (i in 0 until n) {
        when {
            s[i] == t[i] -> {}
            s[i] == '1' && t[i] == 'l' -> {}
            s[i] == 'l' && t[i] == '1' -> {}
            s[i] == '0' && t[i] == 'o' -> {}
            s[i] == 'o' && t[i] == '0' -> {}
            else -> {
                println("No")
                return
            }
        }
    }

    println("Yes")
}