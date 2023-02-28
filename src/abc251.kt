private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC251C()
}

fun solveABC251C() {
    val n = readInt()

    val set = mutableSetOf<String>()
    var resNo = 0
    var resValue = 0
    for (i in 1..n) {
        val (si, ti) = readStrings()
        if (set.contains(si)) {
            // continue
        } else {
            set.add(si)
            if (resValue < ti.toInt()) {
                resValue = ti.toInt()
                resNo = i
            }
        }
    }

    println(resNo)
}

fun solveABC251B() {
    val (n, w) = readInts()
    val a = readInts()

    val goodList = mutableMapOf<Int, Int>()


    for (i in 0 until n) {
        if (w >= a[i]) {
            goodList[a[i]] = 1
        }

        if (n >= 2) {
            for (j in 0 until n) {
                if (i == j) continue

                if (w >= a[i] + a[j]) {
                    goodList[a[i] + a[j]] = 1
                }

                if (n >= 3) {
                    for (k in 0 until n) {
                        if (j == k || k == i) continue

                        if (w >= a[i] + a[j] + a[k]) {
                            goodList[a[i] + a[j] + a[k]] = 1
                        }
                    }
                }
            }
        }
    }

    println(goodList.count())
}

fun solveABC251A() {
    val s = readString()
    var res = s
    while (res.length < 6) {
        res += s
    }
    println(res)
}
