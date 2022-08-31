private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC068A()
}

fun solveABC068B() {
    val n = readLine()!!.toInt()

    var ans = 1
    while (true) {
        val tmpAns = ans * 2
        if (tmpAns <= n) {
            ans = tmpAns
        } else {
            break
        }
    }

    println(ans)
}

fun solveABC068A() {
    val n = readInt()
    println("ABC$n")
}
