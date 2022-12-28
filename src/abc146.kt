private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC146B()
}

fun solveABC146B() {
    val n = readInt()
    val s = readLn()
    // 'a'.toInt() = 65
    for (si in s) {
        // a 1 b 2
        val tmp = si.toInt() - 65
        val tmp2 = (tmp + n) % 26
        val tmp3 = tmp2 + 65
        val tmp4 = tmp3.toChar()
        print(tmp4.toString ())
    }
}

fun solveABC146A() {
    when (readLn()) {
        "SUN" -> println(7)
        "MON" -> println(6)
        "TUE" -> println(5)
        "WED" -> println(4)
        "THU" -> println(3)
        "FRI" -> println(2)
        "SAT" -> println(1)
    }
}
