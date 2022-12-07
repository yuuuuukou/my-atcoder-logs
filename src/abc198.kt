import kotlin.math.pow

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC198B()
}

fun solveABC198B() {
    var n = readInt()

    var cntZero = 0
    for (i in 9 downTo 0) {
        if (n % (10.0.pow(i).toInt()) == 0) {
            // i = 0 0 0こ
            // i = 1 0 1こ
            // i = 2 0 2こ
            cntZero = i
            break
        }
    }

    var n2 = n.toString()
    if (cntZero > 0) {
        n2 = n2.padStart(n2.length + cntZero, '0')
    }

    if (n2 == n2.reversed()) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC198A() {
    val n = readInt()

    var cnt = 0
    for (a in 1 until n) {
        for (b in 1 until n) {
            if (a + b == n) {
                cnt++
            }
        }
    }
    println(cnt)
}