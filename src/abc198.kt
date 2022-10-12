private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC198A()
}

fun solveABC198A() {
    val n = readInt()

    var cnt = 0
    for (a in 1 until n) {
        for (b in 1 until n) {
            if (a + b == n) {
                cnt++
            }
        }
    }
    println(cnt)
}