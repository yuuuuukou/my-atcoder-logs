import java.io.PrintWriter

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
    solveABC294D()
}

fun solveABC294D() {
    val (n, q) = readInts()

    var called = 0
    var completed = 0

    /**
     * 0: uncalled
     * 1: called
     * 2: complete
     */
    var status = Array(n + 1) { 0 }

    val pw = PrintWriter(System.out)

    repeat(q) {
        val event = readInts()
        when (event[0]) {
            1 -> {
                status[++called] = 1
            }
            2 -> {
                status[event[1]] = 2
            }
            3 -> {
                for (i in completed..called) {
                    if (status[i] == 1) {
                        pw.println(i)
                        break
                    } else if (status[i] == 2) {
                        completed = i
                    }
                }
            }
        }
    }

    pw.flush()
}

fun solveABC294C() {
    val (n, m) = readInts()
    val a = readInts()
    val b = readInts()
    val c = mutableListOf<Int>()
    c.addAll(a)
    c.addAll(b)
    c.sort()
    val cMap = mutableMapOf<Int, Int>()
    for ((i, ci) in c.withIndex()) {
        cMap[ci] = i + 1
    }

    for (ai in a) {
        print("${cMap[ai]} ")
    }
    println()
    for (bi in b) {
        print("${cMap[bi]} ")
    }
    println()
}

fun solveABC294B() {
    val (h, w) = readInts()
    repeat(h) {
        val ai = readInts()
        for (aii in ai) {
            print(
                when (aii) {
                    0 -> "."
                    1 -> "A"
                    2 -> "B"
                    3 -> "C"
                    4 -> "D"
                    5 -> "E"
                    6 -> "F"
                    7 -> "G"
                    8 -> "H"
                    9 -> "I"
                    10 -> "J"
                    11 -> "K"
                    12 -> "L"
                    13 -> "M"
                    14 -> "N"
                    15 -> "O"
                    16 -> "P"
                    17 -> "Q"
                    18 -> "R"
                    19 -> "S"
                    20 -> "T"
                    21 -> "U"
                    22 -> "V"
                    23 -> "W"
                    24 -> "X"
                    25 -> "Y"
                    26 -> "Z"
                    else -> ""
                }
            )
        }
        println()
    }
}

fun solveABC294A() {
    val n = readInt()
    val a = readInts()
    for (ai in a) {
        if (ai % 2 == 0) {
            print("$ai ")
        }
    }
}
