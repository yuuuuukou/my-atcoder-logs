fun main(args: Array<String>) {
    solveABC265D()
}

fun solveABC265D() {
//    // 長さnの数列A
//    val (n, p, q, r) = readLine()!!.split(" ").map { it.toLong() }
//    val a = readLine()!!.split(" ").map { it.toLong() }
//

}

fun solveABC265C() {
    // h*wのグリッド
    // (i,j)には文字Gi,jが書かれている
    // 文字はUDLRのいずれか
    // 初期座標は(1,1)

    val gridMap = mutableMapOf<String, String>()
    val isReached = mutableMapOf<String, Boolean>()

    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until h) {
        val row = readLine()!!
        for (j in row.indices) {
            val gridKey = "${i + 1}_${j + 1}"
            gridMap[gridKey] = row[j].toString()
        }
    }

    var x = 1
    var y = 1
    var isLooped = false
    loop@ while (true) {
        val gridKey = "${x}_${y}"

        if (isReached[gridKey] == true) {
            // 循環参照、ループするので-1を出力
            isLooped = true
            break
        } else {
            // 到達済みなことをメモっておく
            isReached[gridKey] = true
        }

        val text = gridMap[gridKey]
        when (text) {
            "U" -> {
                if (x != 1) {
                    x -= 1
                } else {
                    break@loop
                }
            }
            "D" -> {
                if (x != h) {
                    x += 1
                } else {
                    break@loop
                }
            }
            "L" -> {
                if (y != 1) {
                    y -= 1
                } else {
                    break@loop
                }
            }
            "R" -> {
                if (y != w) {
                    y += 1
                } else {
                    break@loop
                }
            }
        }
    }

    if (isLooped) {
        println("-1")
    } else {
        println("$x $y")
    }
}

fun solveABC265B() {
    // n個の部屋が1列に並ぶ(1,2,・・・,n)
    // 持ち時間T
    // 部屋iから部屋i+iに移動するコストはAi、持ち時間が0以下の移動はNG
    // M個のボーナス部屋がある、i番目のボーナス部屋は、部屋Xi
    // Xiに到達すると持ち時間がYi増加
    // 部屋nにたどり着ける？
    val (_, m, t) = readLine()!!.split(" ").map { it.toLong() }

    val a = readLine()!!.split(" ").map { it.toLong() }

    val bonus = mutableMapOf<Long, Long>()
    for (i in 0 until m) {
        val (xi, yi) = readLine()!!.split(" ").map { it.toLong() }
        bonus[xi] = yi
    }

    var canMove = true
    var tmpT = t
    for ((index, ai) in a.withIndex()) {
        val roomNo = (index + 1).toLong()

        // 部屋i(roomNo)から 移動するコスト
        val cost = ai

        // ボーナス部屋なら持ち時間加算
        val bonusTime = bonus[roomNo] ?: 0L
        tmpT += bonusTime

        // 移動可能か？
        if (tmpT > cost) {
            tmpT -= cost
        } else {
            canMove = false
        }
    }

    if (canMove) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC265A() {
    val (x, y, n) = readLine()!!.split(" ").map { it.toInt() }

    if (x * 3 < y) {
        println(x * n)
    } else {
        var tmp = n
        var cost = 0
        while (tmp >= 3) {
            tmp -= 3
            cost += y
        }
        println(cost + tmp * x)
    }
}
