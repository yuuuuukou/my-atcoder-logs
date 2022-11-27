private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC208B()
}

fun solveABC208B() {
    val p = readInt()

    val coin = arrayListOf(
        0,
        1,
        1 * 2,
        1 * 2 * 3,
        1 * 2 * 3 * 4,
        1 * 2 * 3 * 4 * 5,
        1 * 2 * 3 * 4 * 5 * 6,
        1 * 2 * 3 * 4 * 5 * 6 * 7,
        1 * 2 * 3 * 4 * 5 * 6 * 7 * 8,
        1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9,
        1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
    )

    var cnt = 0
    var remain = p
    var mode = 10
    while (remain != 0) {
        if (remain >= coin[mode]) {
            remain -= coin[mode]
            cnt++
        } else {
            mode--
        }
    }

    println(cnt)
}

fun solveABC208A() {
    val (a, b) = readInts()
    if (b in a..6 * a) {
        println("Yes")
    } else {
        println("No")
    }
}