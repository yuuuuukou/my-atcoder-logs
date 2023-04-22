private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC155C()
}

fun solveABC155C() {
    val n = readInt()
    val map = mutableMapOf<String, Int>()

    var max = 0
    repeat(n) {
        val si = readLn()
        map[si] = (map[si] ?: 0) + 1
        max = kotlin.math.max(max, map[si]!!)
    }

    val res = mutableListOf<String>()
    for (item in map) {
        if (item.value == max) {
            res.add(item.key)
        }
    }

    for (item in res.sorted()) {
        println(item)
    }
}

fun solveABC155B() {
    val n = readInt()
    val a = readInts()

    var res = "APPROVED"
    for (ai in a) {
        if (ai % 2 == 0) {
            if (ai % 3 == 0 || ai % 5 == 0) {
                // ok
            } else {
                // ng
                res = "DENIED"
            }
        } else {
            // odd
        }
    }

    println(res)
}

fun solveABC155A() {
    val (a, b, c) = readInts()
    if (a == b && b != c || b == c && c != a || c == a && a != b) {
        println("Yes")
    } else {
        println("No")
    }
}