fun main() {
    solveABC181B()
}

fun solveABC181B() {
    val n = readLine()!!.toLong()
    var cnt = 0L
    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(" ").map { it.toLong() }
        // 1 以上 x 以下の全ての整数の和
        // -> x * (x + 1) / 2
        cnt += ( b * (b + 1) / 2 - a * (a - 1) / 2 )
    }

    println(cnt)

    // TLE
//    val n = readLine()!!.toLong()
//    var cnt = 0L
//    for (i in 0 until n) {
//        val (from, to) = readLine()!!.split(" ").map { it.toLong() }
//        for (j in from .. to) {
//            cnt += j
//        }
//    }
//
//    println(cnt)
}

fun solveABC181A() {
    val n = readLine()!!.toInt()

    if (n % 2 == 0) {
        println("White")
    } else {
        println("Black")
    }
}
