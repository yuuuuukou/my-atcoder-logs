package main

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    solveABC201C()
}

fun solveABC201C() {
    val s = readLine()!!

    val requireArray = arrayOf(false, false, false, false, false, false, false, false, false, false)
    val availableMap = mutableMapOf<Int, Boolean>()
    for ((i, si) in s.withIndex()) {
        if (si.toString() == "o") {
            requireArray[i] = true
            availableMap[i] = true
        } else if (si.toString() == "?") {
            availableMap[i] = true
        }
    }

    if (requireArray.count { it } > 4) {
        println(0)
        exitProcess(0)
    }

    var count = 0
    for (n in 0..9999) {
        val nToString = "%04d".format(n)
        val usedArray = arrayOf(false, false, false, false, false, false, false, false, false, false)
        var isContinue = false
        for (ni in nToString) {
            if (!availableMap.containsKey(ni.toString().toInt())) {
                isContinue = true
            }
            usedArray[ni.toString().toInt()] = true
        }

        if (isContinue) {
            continue
        }

        var countable = true
        for (i in 0 until 10) {
            if (requireArray[i]) {
                if (usedArray[i]) {
                    // 必須 かつ 使用済み ok
                } else {
                    // 必須 かつ 未使用 ng
                    countable = false
                }
            } else {
                // 必須ではない ok
            }
        }

        if (countable) {
            count++
        }
    }

    println(count)
}

fun solveABC201B() {
    val n = readLine()!!.toInt()
    val list = arrayListOf<Pair<String, Int>>()
    for (i in 0 until n) {
        val (s, t) = readLine()!!.split(" ")
        list.add(Pair(s, t.toInt()))
    }
    list.sortByDescending { it.second }
    println(list[1].first)

}

fun solveABC201A() {
    val (a1, a2, a3) = readLine()!!.split(" ").map { it.toInt() }

    var result = false
    if (a3 - a2 == a2 - a1) {
        result = true
    } else if (a2 - a3 == a3 - a1) {
        result = true
    } else if (a3 - a1 == a1 - a2) {
        result = true
    } else if (a1 - a3 == a3 - a2) {
        result = true
    } else if (a1 - a2 == a2 - a3) {
        result = true
    } else if (a2 - a1 == a1 - a3) {
        result = true
    }

    if (result) {
        println("Yes")
    } else {
        println("No")
    }
}
