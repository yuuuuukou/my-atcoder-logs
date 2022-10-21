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
    solveABC248A()
}

fun solveABC248A() {
    val s = readString()
    alertIfNotContain(s, "0")
    alertIfNotContain(s, "1")
    alertIfNotContain(s, "2")
    alertIfNotContain(s, "3")
    alertIfNotContain(s, "4")
    alertIfNotContain(s, "5")
    alertIfNotContain(s, "6")
    alertIfNotContain(s, "7")
    alertIfNotContain(s, "8")
    alertIfNotContain(s, "9")
}

private fun alertIfNotContain(s:String, num:String) {
    if (!s.contains(num)) {
        println(num)
    }
}