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
        solveABC254B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC254B() {
    val n = readInt()

    var list = mutableListOf<Int>()
    for (i in 0 until n) {
        when (i) {
            0 -> {
                println("1")
                list.add(1)
            }
            1 -> {
                println("1 1")
                list.add(1)
            }
            else -> {
                val newList = mutableListOf<Int>()
                newList.add(list[0])
                for (j in 0 until list.lastIndex) {
                    newList.add(list[j] + list[j + 1])
                }
                newList.add(list[list.lastIndex])
                println(newList.joinToString(" "))
                list = newList
            }
        }
    }
}

fun solveABC254A() {
    println(readString().substring(1..2))
}