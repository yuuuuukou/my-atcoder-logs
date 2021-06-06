fun main() {
    solveB()
}

fun solveB() {
    // 全てのマスに対して、
    // 「今いるマスとその右マスがともに空いているなら +1」
    // 「今いるマスとその下マスがともに空いているなら +1」とすることで、
    // 全ての布団の置ける場所を重複なく数えることができます。

    val (h, _) = readLine()!!.split(" ").map { it.toInt() }

    val area = ArrayList<ArrayList<String>>()
    for (i in 0 until h) {
        val tmp = ArrayList<String>()
        tmp.addAll(readLine()!!.split("").map {it})
        area.add(tmp)
    }

    var cnt = 0
    for ((rowIndex, row) in area.withIndex()) {
        for ((colIndex, col) in row.withIndex()) {
            // 右
            if (colIndex < row.size-1 && col == "." && row[colIndex+1] == ".") {
                cnt++
            }

            // 下
            if (rowIndex < area.size-1 && col == "."  && area[rowIndex+1][colIndex] == ".") {
                cnt++
            }
        }
    }

    print(cnt)
}

fun solveA() {
    val s = readLine()
    val t = readLine()

    if (s == "Y") {
        if (t == "a") {
            println("A")
        }
        if (t == "b") {
            println("B")
        }
        if (t == "c") {
            println("C")
        }
    }
    else {
        println(t)
    }
}
