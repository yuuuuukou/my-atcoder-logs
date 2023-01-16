private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC079B()
}

fun solveABC079B() {
    val n = readInt()
    val l = mutableListOf<Long>()
    if (n == 0) {
        println(2)
        return
    }
    l.add(2)
    if (n == 1) {
        println(1)
        return
    }
    l.add(1)
    while (true) {
        l.add(l[l.lastIndex] + l[l.lastIndex - 1])
        if (l.lastIndex == n) {
            println(l[l.lastIndex])
            return
        }
    }
}

fun solveABC079A() {
    val n = readLn()
    if (n[0] == n[1] && n[1] == n[2] || n[1] == n[2] && n[2] == n[3]) {
        println("Yes")
    } else {
        println("No")
    }
}