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
    solveABC300B()
}

fun solveABC300B() {
    val (h, w) = readInts()
    val a = mutableListOf<String>()
    repeat(h) {
        a.add(readString())
    }
    val b = mutableListOf<String>()
    repeat(h) {
        b.add(readString())
    }

    for (hShift in 0 until h) {
        for (wShift in 0 until w) {
            var tmp = true
            for (i in 0 until h) {
                for (j in 0 until w) {
                    val ii = (i + hShift) % h
                    val jj = (j + wShift) % w
                    if (a[ii][jj] != b[i][j]) {
                        tmp = false
                    }
                }
            }

            if (tmp) {
                println("Yes")
                return
            }
        }
    }

    println("No")
}

fun solveABC300A() {
    val (n, a, b) = readInts()
    val c = readInts()

    for (i in c.indices) {
        if (c[i] == a + b) {
            println(i + 1)
        }
    }
}