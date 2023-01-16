private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
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
    solveABC284C()
}

fun solveABC284C() {
    val (n, m) = readInts()

    val list = mutableListOf<MutableMap<Int, Int>>()
    repeat(m) {
        val (ui, vi) = readInts()
        // 既存の連結要素に含まれるかをチェック
        var contains = mutableListOf<Int>()
        for ((i, item) in list.withIndex()) {
            if (item.containsKey(ui) || item.containsKey(vi)) {
                item[ui] = 1
                item[vi] = 1
                contains.add(i)
            }
        }
        // 複数に含まれる場合はマージする
        var base = -1
        for ((index, item) in contains.withIndex()) {
            if (index == 0) {
                base = item
                continue
            }

            var tmp = list[item]
            for (item in tmp) {
                list[base][item.key] = 1
            }
            list.removeAt(item)
        }

        // 含まれない場合は新たな連結要素として追加
        if (contains.size == 0) {
            val tmp = mutableMapOf<Int, Int>()
            tmp[ui] = 1
            tmp[vi] = 1
            list.add(tmp)
        }
    }

    // この時点で孤立しているリンクを探して加算
    var cnt = 0
    for (i in 1..n) {
        var contains = false
        for (item in list) {
            if (item.containsKey(i)) {
                contains = true
                break
            }
        }
        if (!contains) {
            cnt++
        }
    }

    println(list.count() + cnt)
}

fun solveABC284B() {
    val t = readInt()
    repeat(t) {
        val ni = readInt()
        val ai = readInts()

        var cnt = 0
        for (aii in ai) {
            if (aii % 2 == 1) {
                cnt++
            }
        }

        println(cnt)
    }
}

fun solveABC284A() {
    val n = readInt()
    val s = mutableListOf<String>()
    repeat(n) {
        s.add(readString())
    }
    for (i in s.lastIndex downTo 0) {
        println(s[i])
    }
}
