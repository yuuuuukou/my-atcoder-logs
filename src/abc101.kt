private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC101B()
}

fun solveABC101B() {
    val n = readLn()

    var sn = 0
    for (ni in n) {
        sn += ni.toString().toInt()
    }

    if (n.toInt() % sn == 0) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC101A() {
    val s = readLn()
    println(s.count { it.toString() == "+" } - s.count { it.toString() == "-" })
}