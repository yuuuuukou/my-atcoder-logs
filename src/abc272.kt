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
    solveABC272B()
}

fun solveABC272B() {
    val (n, m) = readInts()

    val map = mutableMapOf<String, Boolean>()

    for (i in 0 until m) {
        val kx = readInts()
        for ((index, item) in kx.withIndex()) {
            if (index == 0) continue

            for ((index2, item2) in kx.withIndex()) {
                if (index2 == 0) continue

                map["${item}_${item2}"] = true
            }
        }
    }

    var res = true
    for (i in 1..n) {
        for (j in 1..n) {
            if (i == j) continue

            val dance = map["${i}_${j}"] ?: false
            if (!dance) {
                res = false
            }
        }
    }

    if (res) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC272A() {
    /*val n = */readInt()
    val a = readInts()
    println(a.sum())
}