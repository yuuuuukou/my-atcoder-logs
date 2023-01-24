import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC097B()
}

fun solveABC097B() {
    val x = readInt()

    val map = mutableMapOf<Int, Int>()
    map[1] = 1
    for (i in 2..x) {
        var tmp = i
        while (tmp * i <= x) {
            tmp *= i
            map[tmp] = 1
        }
    }

    for (i in x downTo 1) {
        if (map.containsKey(i)) {
            println(i)
            return
        }
    }
}

fun solveABC097A() {
    val (a, b, c, d) = readInts()

    if ((a - b).absoluteValue <= d && (b - c).absoluteValue <= d || (a - c).absoluteValue <= d) {
        println("Yes")
    } else {
        println("No")
    }
}