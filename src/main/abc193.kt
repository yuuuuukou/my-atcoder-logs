package main

import kotlin.math.min
import kotlin.math.pow

fun main(args: Array<String>) {
    solveABC193D()
}

fun solveABC193D() {
    // 1,2..9がkセット
    val k = readLine()!!.toInt()
    // 手札
    val s = readLine()!!
    val t = readLine()!!

    // 各数字が手札中に何枚あるかのmap
    val sMap = get(s)
    val tMap = get(t)

    var win = 0.0
    for (si in 1..9) {
        for (ti in 1..9) {
            if (calc(sMap, si) > calc(tMap, ti)) {
                // 勝ち
                // siを引くパターンは k-(既にsMapで出てる分)-(既にtMapで出てる分)
                val ss = sMap[si] ?: 0
                val ts = tMap[si] ?: 0
                val sRemain = k - ss - ts
                // tiを引くパターンも k-(既にsMapで出てる分)-(既にtMapで出てる分)
                val st = sMap[ti] ?: 0
                val tt = tMap[ti] ?: 0
                var tRemain = k - st - tt
                // si == tiの時はsiでも使用してるので-1
                if (si == ti) tRemain--
                // 残りの山札
                val remainAll = 9 * k - 8
                // 全体としては siを引くパターン / 残りの山札 * siを引くパターン / 残りの山札(siを引いてるので-1)
                win += sRemain.toDouble() / remainAll * tRemain / (remainAll - 1)
            }
        }
    }

    println(win)
}

private fun calc(map: Map<Int, Int>, i: Int): Int {
    var res = 0
    for (ii in 1..9) {
        var cnt = map[ii] ?: 0
        if (ii == i) {
            cnt++
        }
        res += ii * (10.0.pow(cnt).toInt())
    }
    return res
}

private fun get(string: String): Map<Int, Int> {
    val map = mutableMapOf<Int, Int>()
    for (i in string) {
        if (i.toString() == "#") {
            continue
        }
        if (map.containsKey(i.toString().toInt())) {
            map[i.toString().toInt()] = (map[i.toString().toInt()] ?: 0) + 1
        } else {
            map[i.toString().toInt()] = 1
        }
    }
    return map
}

fun solveABC193C() {
    val n = readLine()!!.toLong()

    val set = mutableSetOf<Long>()
// TLE
//    for (i in 2..n) {
//        for (j in 2..n) {
//            val res = i.toDouble().pow(j.toDouble()).toLong()
//            if (res <= n) {
//                set.add(res)
//            } else {
//                break
//            }
//        }
//    }

// 回答例
    var i = 2L
    while (i * i <= n) {
        var x = i * i
        while (x <= n) {
            set.add(x)
            x *= i
        }
        i++
    }

    println(n - set.size)
}

fun solveABC193B() {
    // n: 店の件数
    // A: 徒歩時間
    // P: 価格
    // x: 在庫
    // *: 0.5分で在庫が1台減少
    val n = readLine()!!.toInt()
    var minPrice = -1
    for (i in 0 until n) {
        val (a, p, x) = readLine()!!.split(" ").map { it.toInt() }
        val canBuy = x - a > 0
        if (canBuy) {
            minPrice =
                    if (minPrice == -1) {
                        p
                    } else {
                        min(minPrice, p)
                    }
        }
    }
    println(minPrice)
}

fun solveABC193A() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }

    println(100 - (b / a * 100))
}
