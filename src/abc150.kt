private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC150A()
}

fun solveABC150B() {
    /*val n =*/ readLine()!!.toInt()
    val s = readLine()!!

    var cnt = 0
    for (i in 0..s.length - 1 - 2) {
        if (s[i].toString() + s[i + 1].toString() + s[i + 2].toString() == "ABC") {
            cnt++
        }
    }
    println(cnt)
}

fun solveABC150A() {
    val (k, x) = readInts()
    if (500 * k >= x) {
        println("Yes")
    } else {
        println("No")
    }
}