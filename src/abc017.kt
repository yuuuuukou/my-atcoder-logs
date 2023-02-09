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
    solveABC017B()
}

fun solveABC017B() {
    val x = readString()
    for ((i, xi) in x.withIndex()) {
        when (xi) {
            'c' -> {
                if (i == x.lastIndex) {
                    println("NO")
                    return
                }
                val next = x[i + 1]
                if (next == 'h') {
                    // ok
                } else {
                    println("NO")
                    return
                }
            }
            'o' -> {}
            'k' -> {}
            'u' -> {}
            'h' -> {
                if (i == 0) {
                    println("NO")
                    return
                }
                val prev = x[i - 1]
                if (prev == 'c') {
                    // ok
                } else {
                    println("NO")
                    return
                }
            }
            else -> {
                println("NO")
                return
            }
        }
    }
    println("YES")
}

fun solveABC017A() {
    val (s1, e1) = readInts()
    val (s2, e2) = readInts()
    val (s3, e3) = readInts()

    println(s1 * e1 / 10 + s2 * e2 / 10 + s3 * e3 / 10)
}