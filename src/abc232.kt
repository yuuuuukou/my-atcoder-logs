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
    solveABC232B()
}

fun solveABC232B() {
    val s = readString()
    val t = readString()

    for (k in 0..27) {
        var flag = true
        for (i in s.indices) {
            val tmp =
                if ((s[i].toInt() + k).toChar() > 'z') {
                    (s[i].toInt() + k - 26).toChar()
                } else {
                    (s[i].toInt() + k).toChar()
                }
            if (tmp == t[i]) {
                // ok
            } else {
                flag = false
            }
        }

        if (flag) {
            println("Yes")
            return
        }
    }

    println("No")
}


fun solveABC232A() {
    val s = readString()
    println(s[0].toString().toInt() * s[2].toString().toInt())
}