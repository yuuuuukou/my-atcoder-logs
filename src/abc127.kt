private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC127C()
}

fun solveABC127C() {
    val (n, m) = readInts()

    var left = 1
    var right = n
    repeat(m) {
        val (li, ri) = readInts()

        if (li in left..right) {
            left = li
        }
        if (ri in left..right) {
            right = ri
        }
        if (ri < left || li > right) {
            println(0)
            return
        }
    }

    println((left..right).toSet().count())
}

fun solveABC127B() {
    val (r, d, x2000) = readInts()

    var x = x2000
    for (i in 1..10) {
        x = r * x - d
        println(x)
    }
}

fun solveABC127A() {
    val (a, b) = readInts()
    when (a) {
        in 0..5 -> {
            println(0)
        }
        in 6..12 -> {
            println(b / 2)
        }
        else -> {
            println(b)
        }
    }
}