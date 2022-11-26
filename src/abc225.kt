private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC225B()
}

fun solveABC225B() {
    val n = readInt()

    val root: Int
    // どちらかとはパスが存在するはず
    var (node1, node2) = readInts()
    var (node3, node4) = readInts()
    if (node1 == node3 || node1 == node4) {
        root = node1
    } else if (node2 == node3 || node2 == node4) {
        root = node2
    } else {
        println("No")
        return
    }

    repeat(n - 1 - 2) {
        val (ai, bi) = readInts()
        if (ai == root || bi == root) {
            // ok
        } else {
            println("No")
            return
        }
    }

    println("Yes")
}

fun solveABC225A() {
    val s = readString()
    if (s[0] == s[1] && s[1] == s[2]) {
        println(1)
    } else if (s[0] != s[1] && s[1] != s[2] && s[2] != s[0]) {
        println(6)
    } else {
        println(3)
    }
}