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
    solveABC297B()
}

fun solveABC297B() {
    val s = readString()

    var b1pos = -1
    var b2pos = -1
    var r1pos = -1
    var r2pos = -1
    var kpos = -1
    for (i in 0 until 8) {
        when (s[i].toString()) {
            "B" -> {
                if (b1pos == -1) {
                    b1pos = i + 1
                } else {
                    b2pos = i + 1
                }
            }
            "R" -> {
                if (r1pos == -1) {
                    r1pos = i + 1
                } else {
                    r2pos = i + 1
                }
            }
            "K" -> {
                kpos = i + 1
            }
        }
    }

    if (
        ((b1pos % 2 == 0 && b2pos % 2 != 0) || (b1pos % 2 != 0 && b2pos % 2 == 0))
        && kpos in r1pos..r2pos
    ) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC297A() {
    val (n, d) = readInts()
    val t = readInts()

    var pre = 0
    for (i in 0 until n) {
        if (i != 0) {
            if (t[i] - pre <= d) {
                println(t[i])
                return
            }
        }

        pre = t[i]
    }

    println(-1)
}