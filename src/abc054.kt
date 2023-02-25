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
    Thread(null, {
        solveABC054B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC054B() {
    val (n, m) = readInts()
    val a = mutableListOf<String>()
    val b = mutableListOf<String>()
    repeat(n) {
        a.add(readString())
    }
    repeat(m) {
        b.add(readString())
    }

    var res = false
    for (startI in 0..n - m) {
        for (startJ in 0..n - m) {
            var isMatched = true
            for (i in 0 until m) {
                for (j in 0 until m) {
                    if (a[startI + i][startJ + j] != b[i][j]) {
                        isMatched = false
                    }
                }
            }
            if (isMatched) {
                res = true
            }
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveABC054A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a == b) {
        println("Draw")
    } else {
        if (a == 1) {
            println("Alice")
        } else {
            if (b == 1) {
                println("Bob")
            } else {
                if (a < b) {
                    println("Bob")
                } else {
                    println("Alice")
                }
            }
        }
    }
}
