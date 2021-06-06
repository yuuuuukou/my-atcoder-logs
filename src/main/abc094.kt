package main

import kotlin.math.min

fun main(args: Array<String>) {
    // n: 0..のマスがある
    //    0 or n へ到達でゴール
    // m: i = 1..m は移動時に1コスト発生
    // x: 始点マス
    // a: am 料金所
    val (_, _, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var toZeroCost = 0
    var toNCost = 0
    for (ai in a) {
        if (ai < x) {
            toZeroCost++
        } else {
            toNCost++
        }
    }

    println(min(toZeroCost, toNCost))
}