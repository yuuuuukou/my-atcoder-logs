import kotlin.math.absoluteValue
import kotlin.system.exitProcess

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    val thread = Thread(null, Runnable {
        solveABC188C()
    }, "solve", 1.shl(26))
    thread.setUncaughtExceptionHandler { _, e -> e.printStackTrace(); exitProcess(1) }
    thread.start()
}

fun solveABC188C() {
    val n = readInt()
    val a = readLongs()

    var a1 = a.toMutableList()
    while (a1.size > 2) {
        var a2 = mutableListOf<Long>()
        for (i in a1.indices step 2) {
            val tmp1 = a1[i]
            val tmp2 = a1[i + 1]
            if (tmp1 < tmp2) {
                a2.add(tmp2)
            } else {
                a2.add(tmp1)
            }
        }
        a1 = a2
    }
    val second = if (a1[0] < a1[1]) {
        a1[0]
    } else {
        a1[1]
    }
    println(a.indexOf(second) + 1)
}

fun solveABC188B() {
    val n = readInt()
    val a = readInts()
    val b = readInts()

    var res = 0
    for (i in 0 until n) {
        res += (a[i] * b[i])
    }

    println(if (res == 0) "Yes" else "No")
}

fun solveABC188A() {
    val (x, y) = readInts()
    if ((x - y).absoluteValue <= 2) {
        println("Yes")
    } else {
        println("No")
    }
}