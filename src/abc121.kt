private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC121A()
}

fun solveABC121B() {
    // n: ソースの数
    // i個目のソースの特徴: ai1, ai2, ,,, , aim
    // 整数b: b1, b2, ,,, , bm
    // 整数c
    val (n, m, c) = readLine()!!.split(" ").map { it.toInt() }

    val b = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    repeat(n) {
        val ai = readLine()!!.split(" ").map { it.toInt() }

        var sum = 0
        repeat(m) {
            sum += ai[it] * b[it]
        }
        sum += c

        if (sum > 0) {
            cnt++
        }
    }

    println(cnt)
}

fun solveABC121A() {
    val (H, W) = readInts()
    val (h, w) = readInts()
    println(H * W - h * W - w * H + h * w)
}