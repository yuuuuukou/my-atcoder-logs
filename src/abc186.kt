private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC186C()
}

fun solveABC186C() {
    val n = readInt()

    var cnt = 0
    for (i in 1..n) {
        if (!i.toString().contains("7") && !i.toString(8).contains("7")) {
            cnt++
        }
    }

    println(cnt)
}

fun solveABC186B() {
    val (h, w) = readInts()

    var min = Int.MAX_VALUE
    val matrix = mutableListOf<MutableList<Int>>()
    repeat(h) {
        val ai = readInts()
        matrix.add(ai)
        min = kotlin.math.min(min, ai.min() ?: Int.MAX_VALUE)
    }

    var res = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            res += (matrix[i][j] - min)
        }
    }

    println(res)
}

fun solveABC186A() {
    val (n, w) = readInts()
    println(n / w)
}