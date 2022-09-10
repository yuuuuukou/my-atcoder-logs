private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC090A()
}

fun solveABC090B() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    for (i in a..b) {
        val iString = i.toString()
        if (iString[0] == iString[4] && iString[1] == iString[3]) {
            cnt++
        }
    }
    println(cnt)
}

fun solveABC090A() {
    val c11c12c13 = readLn()
    val c21c22c23 = readLn()
    val c31c32c33 = readLn()

    println(c11c12c13[0].toString() + c21c22c23[1].toString() + c31c32c33[2].toString())
}