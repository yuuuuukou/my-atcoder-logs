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
    solveABC014B()
}

fun solveABC014B() {
    var (n, x) = readInts()
    val a = readInts()

    var xTo2 = ""
    while (true) {
        xTo2 = "${(x % 2)}$xTo2"
        x /= 2
        if (x == 0) {
            xTo2 = "$x$xTo2"
            break
        }
    }
    xTo2 = xTo2.padStart(n, '0').reversed()

    var sum = 0
    for ((i, xi) in xTo2.withIndex()) {
        if (xi == '1') {
            sum += a[i]
        }
    }

    println(sum)
}

fun solveABC014A() {
    val a = readInt()
    val b = readInt()

    if (a % b == 0) {
        println(0)
    } else {
        println(b - (a % b))
    }
}