fun main(args: Array<String>) {
    solveABC202C()
}

fun solveABC202C() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0L
    val aList = arrayOfNulls<Long>(1000000)
    for (i in 0 until n) {
        val ai = a[i]
        aList[ai] = (aList[ai] ?: 0) + 1
    }
    for (j in 0 until n) {
        val bcj = b[c[j] - 1]
        cnt += aList[bcj] ?: 0L
    }

    println(cnt)
}

fun solveABC202B() {
    val s = readLine()!!.reversed()

    val result = StringBuilder()
    for (si in s) {
        var temp = si.toString()
        when (temp) {
            "6" -> {
                temp = "9"
            }
            "9" -> {
                temp = "6"
            }
        }
        result.append(temp)
    }

    println(result)
}

fun solveABC202A() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    print((7 * 3) - a - b - c)
}
