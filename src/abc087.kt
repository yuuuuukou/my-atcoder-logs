import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC087C()
}

fun solveABC087C() {
    val n = readInt()
    val a1 = readInts()
    val a2 = readInts()

    val a1Sum = mutableListOf<Int>()
    for (ai in a1) {
        if (a1Sum.isNotEmpty()) {
            a1Sum.add(a1Sum[a1Sum.lastIndex] + ai)
        } else {
            a1Sum.add(ai)
        }
    }
    val a2Sum = mutableListOf<Int>()
    for (ai in a2) {
        if (a2Sum.isNotEmpty()) {
            a2Sum.add(a2Sum[a2Sum.lastIndex] + ai)
        } else {
            a2Sum.add(ai)
        }
    }

    var res = 0
    for (i in 0 until n) {
        var tmp = a1Sum[i] + a2Sum[a2Sum.lastIndex]
        if (i != 0) {
            tmp -= a2Sum[i - 1]
        }
        res = max(res, tmp)
    }

    println(res)
}

fun solveABC087B() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()

    var cnt = 0
    for (ai in 0..a) {
        for (bi in 0..b) {
            for (ci in 0..c) {
                if (x == 500 * ai + 100 * bi + 50 * ci) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}

fun solveABC087A() {
    val x = readInt()
    val a = readInt()
    val b = readInt()

    var ans = x
    ans -= a
    while (ans >= b) {
        ans -= b
    }
    println(ans)
}