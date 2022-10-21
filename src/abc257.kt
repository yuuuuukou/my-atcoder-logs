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
    solveABC257A()
}

fun solveABC257A() {
    val (n, x) = readInts()

    var current = "A"
    var nowNum = 0
    while (true) {
        for (i in 1..n) {
            nowNum += 1

            if (nowNum == x) {
                println(current)
                return
            }
        }
        current = (current.toCharArray()[0] + 1).toString()
    }
}