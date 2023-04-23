import kotlin.math.max

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
    solveABC176C()
}

fun solveABC176C() {
    val n = readInt()
    val a = readInts()

    var res = 0L
    var min = 0L
    for (ai in a) {
        if (min > ai) {
            res += min - ai
        }

        min = max(min, ai.toLong())
    }

    println(res)
}

fun solveABC176B() {
    var n = readLine()!!

    var tmp = 0L

    for (element in n) {
        tmp += element.toString().toLong()
    }

    if (tmp % 9L == 0L) {
        print("Yes")
    } else {
        print("No")
    }
}

fun solveABC176A() {
    var (n, x, t) = readLine()!!.split(" ").map { it.toInt() }

    var minuts = 0

    while (n > 0) {
        minuts += t
        n -= x
    }

    print(minuts)
}
