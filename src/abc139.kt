import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC139C()
}

fun solveABC139C() {
    val n = readInt()
    val h = readInts()

    var before = 0
    var cnt = -1
    var res = 0
    for (hi in h) {
        if (before >= hi) {
            cnt++
        }

        res = max(res, cnt)

        if (before < hi) {
            cnt = 0
        }
        before = hi
    }

    println(res)
}

private fun solveABC139B() {
    // a: 電源タップの口数
    // b: b口以上にしたい
    // *: 最初は1口
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    var port = 1
    var tapCnt = 0
    while (port < b) {
        port += (a - 1)
        tapCnt++
    }

    print(tapCnt)
}

fun solveABC139A() {
    val s = readLn()
    val t = readLn()

    val day1 = if (s[0] == t[0]) 1 else 0
    val day2 = if (s[1] == t[1]) 1 else 0
    val day3 = if (s[2] == t[2]) 1 else 0

    println(day1 + day2 + day3)
}
