fun main(args: Array<String>) {
    solveABC209C()
}

fun solveABC209C() {
    // TLE
//    val n = readLine()!!.toBigInteger()
//    val c = readLine()!!.split(" ").map { it.toBigInteger() }.sorted()
//
//    var cnt = 1.toBigInteger()
//    for ((i, ci) in c.withIndex()) {
//        cnt = cnt.times(ci - i.toBigInteger())
//    }
//
//    val ans = (cnt % (1000000007).toBigInteger())
//    println(ans)

    val n = readLine()!!.toInt()
    val c = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var ans = 1L
    for ((i, ci) in c.withIndex()) {
        ans *= (ci - i)
        ans %= 1000000007
    }

    println(ans)
}

fun solveABC209B() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    for ((i, ai) in a.withIndex()) {
        sum += if ((i + 1) % 2 == 0) {
            ai - 1
        } else {
            ai
        }
    }

    if (sum <= x) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC209A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a > b) {
        println("0")
    } else {
        println(b - a + 1)
    }
}
