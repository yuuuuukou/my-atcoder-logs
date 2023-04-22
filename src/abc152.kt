import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC152C()
}

fun solveABC152C() {
    val n = readInt()
    val p = readInts()

    var cnt = 0
    var min = Int.MAX_VALUE
    // それまでに自分より小さい値がなければcnt
    for (pi in p) {
        if (min >= pi) {
            cnt++
        }
        min = min(min, pi)
    }

    println(cnt)
}

fun solveABC152B() {
    val (a, b) = readStrings()

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