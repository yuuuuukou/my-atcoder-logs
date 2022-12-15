private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC111B()
}

fun solveABC111B() {
    var n = readInt()
    while (true) {
        val str = n.toString()
        if (str[0] == str[1] && str[1] == str[2]) {
            println(str)
            return
        } else {
            n++
        }
    }
}

fun solveABC111A() {
    val n = readLn()
    println(n.replace("9", "x").replace("1", "9").replace("x", "1"))
}