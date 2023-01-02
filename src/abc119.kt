private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC119B()
}

fun solveABC119B() {
    val n = readInt()

    var res = 0.0
    repeat(n) {
        val (xiStr, yi) = readStrings()
        val xi = xiStr.toDouble()
        when (yi) {
            "JPY" -> res += xi
            "BTC" -> res += xi * 380000.0
        }
    }

    println(res)
}

fun solveABC119A() {
    val s = readLn()
    if (s <= "2019/04/30") {
        println("Heisei")
    } else {
        println("TBD")
    }
}