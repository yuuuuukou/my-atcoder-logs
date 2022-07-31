fun main(args: Array<String>) {
    solveABC085C()
}

fun solveABC085C() {
    val (n, y) = readLine()!!.split(" ").map { it.toInt() }

    var ans = "-1 -1 -1"
    for (i in 0..n) {
        for (j in 0..n - i) {
            val k = n - i - j

            if (10000 * i + 5000 * j + 1000 * k == y) {
                ans = "$i $j $k"
            }
        }
    }

    println(ans)
}

fun solveABC085B() {
    val n = readLine()!!.toInt()
    val d = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        val di = readLine()!!.toInt()
        d[di] = 1
    }
    println(d.size)
}

fun solveABC085A() {
    val s = readLine()!!

    println(s.replace("2017", "2018"))
}
