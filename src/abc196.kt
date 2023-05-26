private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC196C()
}

fun solveABC196C() {
    val n = readLong()

    var cnt = 0
    for (i in 1..1000000) {
        val target = "$i$i".toLong()
        if (target <= n) {
            cnt++
        } else {
            break
        }
    }

    println(cnt)
}

fun solveABC196B() {
    val x = readString()
    val period = x.indexOf(".")
    if (period != -1) {
        println(x.substring(0 until period))
    } else {
        println(x)
    }
}

fun solveABC196A() {
    val (a, b) = readInts()
    val (c, d) = readInts()
    println(b - c)
}