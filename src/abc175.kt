private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC175A()
}

fun solveABC175B() {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    for (i in 0 until n) {
        for (j in i until n) {
            for (k in j until n) {
                val contain = j in (i + 1) until k
                if (!contain) {
                    continue
                }

                val li = l[i]
                val lj = l[j]
                val lk = l[k]

                if (li == lj || lj == lk || lk == li) {
                    // li, lj, lkがすべて異なる が偽
                    continue
                }

                // 三角形の成立条件 : 各辺において、他の2辺の和よりも長さが短いこと
                // -> a + b > c && b + c > a && c + a > b
                if (li + lj > lk && lj + lk > li && lk + li > lj) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}

fun solveABC175A() {
    val s = readLn()
    if (s[0].toString() == "R") {
        if (s[1].toString() == "R") {
            if (s[2].toString() == "R") {
                println(3)
            } else {
                println(2)
            }
        } else {
            if (s[2].toString() == "R") {
                println(1)
            } else {
                println(1)
            }
        }
    } else {
        if (s[1].toString() == "R") {
            if (s[2].toString() == "R") {
                println(2)
            } else {
                println(1)
            }
        } else {
            if (s[2].toString() == "R") {
                println(1)
            } else {
                println(0)
            }
        }
    }
}