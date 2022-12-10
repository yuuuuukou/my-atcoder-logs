private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC152B()
}

fun solveABC152B() {
    val (a,b) = readStrings()

    var x = ""
    repeat(b.toInt()) {
        x += a
    }

    var y = ""
    repeat(a.toInt()) {
        y += b
    }

    if (x < y) {
        println(x)
    } else {
        println(y)
    }
}

fun solveABC152A() {
    val (n, m) = readInts()
    if (n == m) {
        println("Yes")
    } else {
        println("No")
    }
}