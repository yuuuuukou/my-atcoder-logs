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
    solveABC200C()
}

fun solveABC200C() {
    val n = readInt()
    val a = readInts()

    var cnt = 0L
    val map = mutableMapOf<Int, Int>()
    // 200で割った余りに変える
    // 余りが同じ値になる組み合わせは条件を満たす
    for (ai in a) {
        val mod = ai % 200
        cnt += (map[mod] ?: 0)
        map[mod] = (map[mod] ?: 0) + 1
    }

    println(cnt)
}

fun solveABC200B() {
    val (n, k) = readLine()!!.split(" ").map { it }

    var result = n

    for (i in 0 until k.toInt()) {
        if (result.toLong() % 200 == 0L) {
            result = (result.toLong() / 200).toString()
        } else {
            result += "200"
        }
    }

    println(result)
}

fun solveABC200A() {
    var n = readLine()!!.toInt()

    var cnt = 1
    while (n > 0) {
        n -= 100
        if (n > 0) {
            cnt++
        }
    }

    println(cnt)
}
