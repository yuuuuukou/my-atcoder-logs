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
    solveABC247B()
}

fun solveABC247B() {
    val n = readInt()

    val s = mutableListOf<String>()
    val t = mutableListOf<String>()
    repeat(n) {
        val (si, ti) = readStrings()
        s.add(si)
        t.add(ti)
    }

    var res = "Yes"
    for (i in 0 until n) {
        // 姓名が同一ケースの考慮
        val checkNum = if (s[i] == t[i]) 2 else 1

        val sDuplicationCnt = s.count { it == s[i] } + t.count { it == s[i] }
        val tDuplicationCnt = s.count { it == t[i] } + t.count { it == t[i] }
        if (sDuplicationCnt == checkNum || tDuplicationCnt == checkNum) {
            // ok
        } else {
            res = "No"
        }
    }
    println(res)
}

fun solveABC247A() {
    val s = readString()
    println("0${s[0]}${s[1]}${s[2]}")
}