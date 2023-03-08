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
    solveABC236C()
}

fun solveABC236C() {
    val (n, m) = readInts()
    val s = readStrings()
    val t = readStrings().toSet()

    for (si in s) {
        if (t.contains(si)) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun solveABC236B() {
    val n = readInt()
    val a = readInts()

    val map = mutableMapOf<Int, Int>()
    for (ai in a) {
        map[ai] = (map[ai] ?: 0) + 1
    }
    for (item in map) {
        if (item.value == 3) {
            println(item.key)
            return
        }
    }
}

fun solveABC236A() {
    val s = readString()
    val (a, b) = readInts()

    var res = ""
    for ((i, si) in s.withIndex()) {
        val tmp =
            if (i + 1 == a) {
                s[b - 1]
            } else if (i + 1 == b) {
                s[a - 1]
            } else {
                s[i]
            }
        res += tmp
    }
    println(res)
}