private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC207B()
}

fun solveABC207B() {
    val (a, b, c, d) = readLongs()

    var bucket = Pair(a, 0L)
    var cnt = 0
    var preRate = Double.MAX_VALUE
    while (true) {
        val rate = bucket.first.toDouble() / bucket.second.toDouble()
        if (rate <= d) {
            println(cnt)
            return
        }
        if (cnt > 0) {
            if (rate >= preRate) {
                println(-1)
                return
            }
        }

        preRate = rate
        bucket = Pair(bucket.first + b, bucket.second + c)
        cnt++
    }
}

fun solveABC207A() {
    val abc = readInts().sortedDescending()
    println(abc[0] + abc[1])
}