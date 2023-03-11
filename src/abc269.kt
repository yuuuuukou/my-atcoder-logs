private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC269C()
}

fun solveABC269C() {
    val n = readLong()

    for (i in 0..n) {
        println(i.toString(2))
        println(i.toString(2).toByte(2))
    }

    // わからん、解説ACする
}

fun solveABC269D() {
    val n = readInt()
    val grid = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = readInts()
        grid.add(Pair(x, y))
    }

    // 連結状態を控えるmap
    var groupMap = mutableMapOf<String, MutableList<Pair<Int, Int>>>()

    for (gridItem in grid) {
        val containGroupKeys = mutableListOf<String>()
        val tmpGroupMap = deepCopy(groupMap)

        for (group in groupMap) {
            for (pair in group.value) {
                // ループの要素(gridItem)とmapの中身が連結しているなら、gridItemをmapに詰める
                if (isLinked(gridItem, pair)) {
                    val list = tmpGroupMap[group.key]!!
                    list.add(gridItem)
                    tmpGroupMap[group.key] = list

                    // 複数グループに所属するようであれば統合する必要がある。控えておく
                    if (!containGroupKeys.contains(group.key)) {
                        containGroupKeys.add(group.key)
                    }
                }
            }
        }

        // ループ処理用に使用していたmapを戻す
        groupMap = tmpGroupMap

        if (containGroupKeys.isEmpty()) {
            // 合致するグループが無ければ自身のグループを新規作成する
            val list = mutableListOf<Pair<Int, Int>>()
            list.add(gridItem)
            groupMap["${gridItem.first}_${gridItem.second}"] = list
        }

        groupMap = mergeGroups(containGroupKeys, groupMap)
    }

    println(groupMap.count())
}

// map内部のlistが参照切れないのでdeepCopyを実装する
private fun deepCopy(groupMap: MutableMap<String, MutableList<Pair<Int, Int>>>): MutableMap<String, MutableList<Pair<Int, Int>>> {
    val result = mutableMapOf<String, MutableList<Pair<Int, Int>>>()
    for (item in groupMap) {
        result[item.key] = item.value.toMutableList()
    }
    return result
}

// 連結判定
private fun isLinked(node1: Pair<Int, Int>, node2: Pair<Int, Int>): Boolean {
    return when (node1.first) {
        node2.first -> {
            node2.second in node1.second - 1..node1.second + 1
        }
        node2.first + 1 -> {
            node2.second in node1.second - 1..node1.second
        }
        node2.first - 1 -> {
            node2.second in node1.second..node1.second + 1
        }
        else -> {
            false
        }
    }
}

// 重複グループの統合
fun mergeGroups(
    containGroupKeys: MutableList<String>,
    groupMap: MutableMap<String, MutableList<Pair<Int, Int>>>
): MutableMap<String, MutableList<Pair<Int, Int>>> {
    if (containGroupKeys.count() <= 1) {
        return groupMap
    }

    val result = deepCopy(groupMap)
    var mergeKey: String? = null
    for (key in containGroupKeys) {
        if (mergeKey == null) {
            mergeKey = key
        } else {
            val mergeTo = result[mergeKey]!!
            val mergeFrom = result[key]!!
            mergeTo.addAll(mergeFrom)

            result[mergeKey] = mergeTo
            result.remove(key)
        }
    }

    return result
}

fun solveABC269B() {
    val s = mutableListOf<String>()
    repeat(10) {
        s.add(readLn())
    }

    var a = 0
    var b = 0
    var c = 0
    var d = 0

    for ((row, si) in s.withIndex()) {
        for ((col, sii) in si.withIndex()) {
            val tmp = sii.toString()
            if (tmp == "#") {
                if (a == 0) {
                    a = row + 1
                    b = row + 1
                    c = col + 1
                    d = col + 1
                } else {
                    b = row + 1
                    d = col + 1
                }
            }
        }
    }

    println("$a $b\n$c $d")
}

fun solveABC269A() {
    val (a, b, c, d) = readInts()
    println((a + b) * (c - d))
    println("Takahashi")
}
