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
    solveABC241B()
}

fun solveABC241B() {
    val (n, m) = readInts()
    val a = readInts()
    val b = readInts()
    for (bi in b) {
        if (a.contains(bi)) {
            a.remove(bi)
        } else {
            println("No")
            return
        }
    }
    println("Yes")
}

fun solveABC241A() {
    val a = readInts()

    var tmp = 0
    tmp = a[tmp]
    tmp = a[tmp]
    tmp = a[tmp]

    println(tmp)
}