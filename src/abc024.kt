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
    solveABC024B()
}

fun solveABC024B() {
    val (n, t) = readInts()

    var current = 0L
    var sum = 0L
    repeat(n) {
        val ai = readLong()
        if (current >= ai) {
            sum -= current - ai
        }
        sum += t
        current = ai + t
    }
    println(sum)
}

fun solveABC024A() {
    val (a, b, c, k) = readInts()
    val (s, t) = readInts()

    var res = 0

    res += a * s
    res += b * t

    if (s + t >= k) {
        res -= (s + t) * c
    }

    println(res)
}