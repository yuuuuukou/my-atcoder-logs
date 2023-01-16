private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC104B()
}

fun solveABC104B() {
    val s = readLn()

    var cntC = 0
    var res = true
    for ((i, si) in s.withIndex()) {
        when {
            i == 0 -> {
                if (si != 'A') {
                    res = false
                }
            }
            i in 2 until s.lastIndex -> {
                if (si == 'C') {
                    cntC++
                }
            }
            else -> {
                if (si.toString() != si.toString().toLowerCase()) {
                    res = false
                }
            }
        }
    }
    if (cntC != 1) {
        res = false
    }

    println(if (res) "AC" else "WA")
}

fun solveABC104A() {
    val r = readInt()
    if (r < 1200) {
        println("ABC")
    } else if (r < 2800) {
        println("ARC")
    } else {
        println("AGC")
    }
}