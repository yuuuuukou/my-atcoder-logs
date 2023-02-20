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
        solveABC290B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC290B() {
    val (n, k) = readInts()
    val s = readString()

    var cnt = 0
    for (si in s) {
        if (si == 'o' && cnt < k) {
            print("o")
            cnt++
        } else {
            print("x")
        }
    }
    println()
}

fun solveABC290A() {
    val (n, m) = readInts()
    val a = readInts()
    val b = readInts()

    var sum = 0
    for (bi in b) {
        sum += a[bi - 1]
    }

    println(sum)
}