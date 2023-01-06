private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC073B()
}

fun solveABC073B() {
    val n = readInt()

    var cnt = 0
    repeat(n) {
        val (li, ri) = readInts()
        cnt += (ri - li + 1)
    }

    println(cnt)
}

fun solveABC073A() {
    val n = readLn()

    for (ni in n) {
        if (ni.toString() == "9") {
            println("Yes")
            return
        }
    }
    println("No")
}
