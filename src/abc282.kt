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
    solveABC282D()
}

fun solveABC282D() {
    val (n, m) = readInts()
    val graph = mutableMapOf<Int, MutableList<Int>>()
    repeat(m) {
        val (ui, vi) = readInts()
        val tmpLink = (graph[ui] ?: mutableListOf())
        tmpLink.add(vi)
        graph[ui] = tmpLink
        val tmpLink2 = (graph[vi] ?: mutableListOf())
        tmpLink2.add(ui)
        graph[vi] = tmpLink2
    }

    var cnt = 0
    for (i in 1..n) {
        for (j in i + 1..n) {
            if (graph[i]?.contains(j) == true) {
                // 既存リンクがあればng
                continue
            }

            // リンク追加してみて二部グラフ判定
            val tmpLink = (graph[i] ?: mutableListOf())
            tmpLink.add(j)
            graph[i] = tmpLink
            val tmpLink2 = (graph[j] ?: mutableListOf())
            tmpLink2.add(i)
            graph[j] = tmpLink2

            // 二部グラフ判定
            // 矛盾があればcolorMapのvalueに-1が含まれる
            var colorMap = mutableMapOf<Int, Int>()
            paint(i, graph, colorMap, 0)
            if (colorMap.containsValue(-1)) {
                // not 二部グラフ
            } else {
                cnt++
            }

            // 追加したリンクを消す
            tmpLink.removeAt(tmpLink.lastIndex)
            tmpLink2.removeAt(tmpLink2.lastIndex)
            graph[i] = tmpLink
            graph[j] = tmpLink2
        }
    }

    println(cnt)
}

fun paint(node: Int, graph: MutableMap<Int, MutableList<Int>>, colorMap: MutableMap<Int, Int>, color: Int) {
    if (colorMap[node] == null) {
        // ノードに色を塗る
        colorMap[node] = color
    } else {
        // 既に到達済みで塗られてる
        // 矛盾していないかチェック
        if (colorMap[node] != color) {
            colorMap[node] = -1
        }

        // 矛盾してればngだし、矛盾していなくてもこの先は探索済み
        return
    }

    // 各リンクに対して同様に処理
    val nodes = graph[node] ?: mutableListOf()
    for (n in nodes) {
        paint(n, graph, colorMap, if (color == 1) 0 else 1)
    }
}

fun solveABC282C() {
    val n = readInt()
    val s = readString()

    var res = StringBuilder()
    var quoteCnt = 0
    for ((i, siChar) in s.withIndex()) {
        val si = siChar.toString()

        if (si == "\"") quoteCnt++

        when {
            quoteCnt % 2 == 0 -> {
                // 括られていない文字、カンマならreplace
                if (si == ",") {
                    res.append(".")
                } else {
                    res.append(siChar)
                }
            }
            quoteCnt % 2 == 1 -> {
                // 括られた文字、replace無し
                res.append(siChar)
            }
        }
    }

    println(res)
}

fun solveABC282B() {
    val (n, m) = readInts()
    val s = mutableListOf<String>()
    repeat(n) {
        s.add(readString())
    }

    var cnt = 0
    for ((i1, s1) in s.withIndex()) {
        for ((i2, s2) in s.withIndex()) {
            // 全探索して重複ケースと同一人物ケースのみcontinue
            if (i1 >= i2) continue

            var canSolve = true
            for (j in 0 until m) {
                if (s1[j] == 'o' || s2[j] == 'o') {
                    // ok
                } else {
                    // ng
                    canSolve = false
                }
            }
            if (canSolve) cnt++
        }
    }

    println(cnt)
}

fun solveABC282A() {
    val k = readInt()
    var s = 'A'.toInt()
    repeat(k) {
        print(s.toChar().toString())
        s++
    }
}