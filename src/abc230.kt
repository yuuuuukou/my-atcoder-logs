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
    solveABC230B()
}

fun solveABC230B() {
    val s = readString()

    var pattern1 = true
    var pattern2 = true
    var pattern3 = true
    for ((index, si) in s.withIndex()) {
        if (index in arrayOf(0, 3, 6, 9) && si.toString() != "o") {
            pattern1 = false
        }
        if (index in arrayOf(1, 2, 4, 5, 7, 8) && si.toString() != "x") {
            pattern1 = false
        }

        if (index in arrayOf(2, 5, 8) && si.toString() != "o") {
            pattern2 = false
        }
        if (index in arrayOf(0, 1, 3, 4, 6, 7, 9) && si.toString() != "x") {
            pattern2 = false
        }

        if (index in arrayOf(1, 4, 7) && si.toString() != "o") {
            pattern3 = false
        }
        if (index in arrayOf(0, 2, 3, 5, 6, 8, 9) && si.toString() != "x") {
            pattern3 = false
        }
    }

    println(if (pattern1 || pattern2 || pattern3) "Yes" else "No")
}

fun solveABC230A() {
    var n = readInt()

    if (n >= 42) {
        n += 1
    }

    print("AGC" + n.toString().padStart(3, '0'))
}