private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC087A()
}

fun solveABC087B() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()

    var cnt = 0
    for (ai in 0..a) {
        for (bi in 0..b) {
            for (ci in 0..c) {
                if (x == 500 * ai + 100 * bi + 50 * ci) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}

fun solveABC087A() {
    val x = readInt()
    val a = readInt()
    val b = readInt()

    var ans = x
    ans -= a
    while (ans >= b) {
        ans -= b
    }
    println(ans)
}