private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC075B()
}

fun solveABC075B() {
    val (h, w) = readInts()
    val s = mutableListOf<String>()
    repeat(h) {
        s.add(readLn())
    }

    for ((i, si) in s.withIndex()) {
        for ((j, sij) in si.withIndex()) {
            if (sij == '#') {
                print("#")
            } else {
                var cnt = 0
                if (i - 1 >= 0) {
                    if (j - 1 >= 0) {
                        if (s[i - 1][j - 1] == '#') cnt++
                    }
                    if (j + 1 < w) {
                        if (s[i - 1][j + 1] == '#') cnt++
                    }
                    if (s[i - 1][j] == '#') cnt++
                }
                if (i + 1 < h) {
                    if (j - 1 >= 0) {
                        if (s[i + 1][j - 1] == '#') cnt++
                    }
                    if (j + 1 < w) {
                        if (s[i + 1][j + 1] == '#') cnt++
                    }
                    if (s[i + 1][j] == '#') cnt++
                }
                if (j - 1 >= 0) {
                    if (s[i][j - 1] == '#') cnt++
                }
                if (j + 1 < w) {
                    if (s[i][j + 1] == '#') cnt++
                }
                print(cnt)
            }
        }
        println()
    }
}

fun solveABC075A() {
    val (a, b, c) = readInts()
    if (a == b) {
        println(c)
    } else {
        if (a == c) {
            println(b)
        } else {
            println(a)
        }
    }
}