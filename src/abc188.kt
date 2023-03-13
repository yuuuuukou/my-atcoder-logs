import kotlin.math.absoluteValue

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    Thread(null, {
        solveABC188C()
    }, "solve", 1.shl(26)).start()
}

fun solveABC188C() {
    val n = readInt()
    val a = readLongs()

    var a1 = a.toMutableList()
    var a2 = mutableListOf<Long>()
    while (true) {
        for (i in a1.indices step 2) {
            val tmp1 = a1[i]
            val tmp2 = a1[i + 1]
            if (tmp1 < tmp2) {
                a2.add(tmp2)
            } else {
                a2.add(tmp1)
            }
        }

        if (a2.size == 2) {
            val second = if (a2[0] < a2[1]) {
                a2[0]
            } else {
                a2[1]
            }
            println(a.indexOf(second) + 1)
            return
        } else {
            a1 = a2
            a2 = mutableListOf()
        }
    }
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