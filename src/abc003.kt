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
    solveABC003B()
}

fun solveABC003B() {
    val s = readString()
    val t = readString()

    for (i in s.indices) {
        val si = s[i]
        val ti = t[i]
        if (si == ti) continue
        if (si == '@' && ti in arrayOf('a', 't', 'c', 'o', 'd', 'e', 'r')) continue
        if (ti == '@' && si in arrayOf('a', 't', 'c', 'o', 'd', 'e', 'r')) continue

        println("You will lose")
        return
    }

    println("You can win")
}

fun solveABC003A() {
    val n = readInt()
    var tmp = 0.0
    for (i in 1..n) {
        tmp += (i.toDouble() * 10000 / n)
    }
    println(tmp)
}