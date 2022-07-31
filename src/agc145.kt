fun main(args: Array<String>) {
    solveAGC145B()
}

fun solveAGC145B() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toLong() }

    var aliceWinCnt = 0L

    var tmp = 0L
    while (tmp < n) {
        tmp += a
        aliceWinCnt++
    }

    if (n % a != 0L) {
        aliceWinCnt -= 1
    }

    aliceWinCnt *= b

    if (n % a != 0L) {
        aliceWinCnt -= (b - a)
    }

    println(aliceWinCnt)
}

fun solveAGC145A() {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    val res: String
    if (n == 2) {
        if (s == "AA" || s == "BB") {
            res = "Yes"
        } else {
            res = "No"
        }
    } else {
        if (s[n - 1].toString() == "A") {
            // 末尾がAの時点で、この条件であれば回文を作ることができる
            res = "Yes"
        } else {
            if (s[0].toString() == "B") {
                // 末尾がBのときは、先頭もBであれば回文を作ることができる
                res = "Yes"
            } else {
                res = "No"
            }
        }
    }

    println(res)
}
