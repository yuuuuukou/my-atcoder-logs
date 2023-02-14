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
    solveABC001B()
}

fun solveABC001B() {
    val m = readInt()
    when (m) {
        in 0 until 100 -> {
            println("00")
        }
        in 100..5000 -> {
            val vv = m / 100
            println(vv.toString().padStart(2, '0'))
        }
        in 6000..30000 -> {
            println(m / 1000 + 50)
        }
        in 35000..70000 -> {
            println((m / 1000 - 30) / 5 + 80)
        }
        in 70000..100000 -> {
            println("89")
        }
    }
}

fun solveABC001A() {
    val h1 = readInt()
    val h2 = readInt()

    println(h1 - h2)
}