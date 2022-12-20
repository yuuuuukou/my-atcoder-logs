private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC197B()
}

fun solveABC197B() {
    val (h, w, x, y) = readInts()
    val s = mutableListOf<String>()
    repeat(h) {
        s.add(readString())
    }

    var horizontalCnt = 0
    var tmp = 0
    var flg = 0
    for (i in 0 until w) {
        if (i == y - 1) {
            flg = 1
        }
        if (s[x - 1][i] == '#') {
            if (flg == 1) {
                horizontalCnt = tmp
                flg = 0
            }
            tmp = 0
        } else {
            tmp++
            if (i == w - 1 && flg == 1) {
                horizontalCnt = tmp
            }
        }
    }

    var verticalCnt = 0
    tmp = 0
    flg = 0
    for (i in 0 until h) {
        if (i == x - 1) {
            flg = 1
        }
        if (s[i][y - 1] == '#') {
            if (flg == 1) {
                verticalCnt = tmp
                flg = 0
            }
            tmp = 0
        } else {
            tmp++
            if (i == h - 1 && flg == 1) {
                verticalCnt = tmp
            }
        }
    }

    println(horizontalCnt + verticalCnt - 1)
}

fun solveABC197A() {
    val s = readString()
    println("${s[1]}${s[2]}${s[0]}")
}