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
    solveABC006B()
}

fun solveABC006B() {
    val n = readInt()
    when (n) {
        1 -> {
            println(0)
        }
        2 -> {
            println(0)
        }
        3 -> {
            println(1)
        }
        else -> {
            val list = mutableListOf<Int>()
            list.add(0)
            list.add(0)
            list.add(1)
            for (i in 3 until n) {
                list.add((list[i - 1] + list[i - 2] + list[i - 3]) % 10007)
            }
            println(list[list.lastIndex] % 10007)
        }
    }
}

fun solveABC006A() {
    val n = readInt()
    println(if (n % 3 == 0) "YES" else "NO")
}