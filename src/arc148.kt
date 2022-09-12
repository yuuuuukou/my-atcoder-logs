private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveARC148B()
}

fun solveARC148B() {
    val n = readInt()
    val s = readLn()

    var lIndex: Int? = null
    var rIndex: Int
    val rIndexTmpMap = mutableMapOf<Int, Int>()
    var start: Int? = null

    if (n == 2) {
        println("dd")
        return
    }

    for ((i, si) in s.withIndex()) {
        // 一番最初にpが出てきたところがL
        if (si.toString() == "p" && lIndex == null) {
            lIndex = i
        }

        // pが一番連続している部分の終端がR
        // startとして始点のindexを覚えつつ、mapでどれだけ連続しているかを覚えておく
        if (si.toString() == "p") {
            if (start == null) {
                start = i
                rIndexTmpMap[i] = 1
            } else {
                rIndexTmpMap[start] = (rIndexTmpMap[start] ?: 0) + 1
            }
        }

        // dがきたら連続が途切れるので、startはクリアする
        if (si.toString() == "d") {
            start = null
        }
    }

    val resList = mutableListOf<String>()
    if (lIndex == null) {
        println(s)
        return
    }
    for (item in rIndexTmpMap.toSortedMap()) {
        rIndex = item.key + item.value - 1

        val res1 = s.substring(0 until lIndex)
        var res2tmp = s.substring(lIndex..rIndex)
        val res3 = if (rIndex == s.lastIndex) {
            ""
        } else {
            s.substring(rIndex + 1..s.lastIndex)
        }

        var res2 = ""
        res2tmp = res2tmp.reversed()
        for (i in res2tmp) {
            if (i.toString() == "p") {
                res2 += "d"
            } else {
                res2 += "p"
            }
        }

        resList.add(res1 + res2 + res3)
    }

    println(resList.sorted()[0])
}
