private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC078B()
}

fun solveABC078B() {
    val (x, y, z) = readInts()

    var tmp = x
    var cnt = 0
    while (true) {
        if (tmp >= y + 2 * z) {
            tmp -= y + z
            cnt++
        } else {
            break
        }
    }

    println(cnt)
}

fun solveABC078A() {
    val (x, y) = readStrings()
    if (x < y) {
        println("<")
    } else if (x > y) {
        println(">")
    } else {
        println("=")
    }
}