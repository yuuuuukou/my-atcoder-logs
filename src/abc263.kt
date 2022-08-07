fun main(args: Array<String>) {
    solveABC263C()
}

fun solveABC263C() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val matrix = mutableListOf<MutableList<Int>>()

    // 0行目を固定で作成
    val firstLine = mutableListOf<Int>()
    for (i in 0 until n) {
        if (i == 0) {
            firstLine.add(1)
        } else {
            firstLine.add(firstLine[i - 1] + 1)
        }
    }
    firstLine.add(100) // indexあふれないように
    matrix.add(firstLine)

    // 1行目以降を作成
    var creatingLine = 1
    while (matrix[creatingLine - 1][0] != n || matrix[creatingLine - 1][n - 1] != m) {
        val line = mutableListOf<Int>()
        line.add(100) // indexあふれないように
        var mustStopIncrement = false
        for (i in n - 1 downTo 0) {
            val top = matrix[creatingLine - 1][i]
            val right = line.last()
            val topRight = matrix[creatingLine - 1][i + 1]
            if (!mustStopIncrement) {
                if (top < m) {
                    if (top + 1 < right) {
                        line.add(top + 1)
                        mustStopIncrement = true
                    } else {
                        line.add(top)
                    }
                } else {
                    line.add(top)
                }
            } else {
                line.add(top)
            }
        }
        line.reverse()
        matrix.add(line)
        creatingLine++
    }

    for (line in matrix) {
        line.removeAt(line.lastIndex)
        println(line.joinToString(" "))
    }
}

fun solveABC263B() {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()
    for (i in 0 until n - 1) {
        // i==0 人2の親
        map[i + 2] = p[i]
    }

    println(getAncestor(map, n))

}

fun getAncestor(map: MutableMap<Int, Int>, n: Int): Int {
    if (map[n] == null) {
        return 0
    } else {
        return 1 + getAncestor(map, map[n]!!)
    }

}

fun solveABC263A() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()

    for (item in input) {
        map[item] = (map[item] ?: 0) + 1
    }

    if (map.size == 2) {
        for (item in map) {
            if (item.value == 2 || item.value == 3) {
                println("Yes")
                return
            } else {
                println("No")
                return
            }
        }
    } else {
        println("No")
        return
    }
}
