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
    solveABC278D()
}

fun solveABC278D() {
    val n = readLong()

//    val tmp = readString().split(" ")
//    var a = tmp.map { it.toLong() }.toMutableList()
//    val q = readInt()
//    repeat(q) {
//        val qi = readInts()
//        when (qi[0]) {
//            1 -> {
//                a = tmp.map { qi[1].toLong() }.toMutableList()
//            }
//            2 -> {
//                a[qi[1] - 1] = a[qi[1] - 1] + qi[2]
//            }
//            3 -> {
//                println(a[qi[1] - 1])
//            }
//        }
//    }

    val tmp = readString().split(" ")

    var map = mutableMapOf<Int, Long>()
    val a = tmp.map { it.toLong() }.toMutableList()
    for ((index, ai) in a.withIndex()) {
        map[index + 1] = ai
    }

    var mode = 0L

    val q = readInt()
    repeat(q) {
        val qi = readInts()
        when (qi[0]) {
            1 -> {
                map = mutableMapOf()
                mode = qi[1].toLong()
            }
            2 -> {
                map[qi[1]] = (map[qi[1]] ?: mode) + qi[2]
            }
            3 -> {
                println((map[qi[1]] ?: mode))
            }
        }
    }
}

fun solveABC278C() {
//    val (n, q) = readInts()
//
//    val map = mutableMapOf<Int, MutableList<Int>>()
//
//    for (i in 0 until q) {
//        val (ti, ai, bi) = readInts()
//        when (ti) {
//            1 -> {
//                val tmp = map[ai] ?: mutableListOf()
//                if (!tmp.contains(bi)) {
//                    tmp.add(bi)
//                    map[ai] = tmp
//                }
//            }
//            2 -> {
//                val tmp = map[ai] ?: mutableListOf()
//                if (tmp.contains(bi)) {
//                    tmp.remove(bi)
//                    map[ai] = tmp
//                }
//            }
//            3 -> {
//                val AContainsB = (map[ai]?.contains(bi)) ?: false
//                val BContainsA = (map[bi]?.contains(ai)) ?: false
//                if (AContainsB && BContainsA) {
//                    println("Yes")
//                } else {
//                    println("No")
//                }
//            }
//        }
//    }

//    val (n, q) = readInts()
//
//    val matrix: MutableList<MutableList<Int>> = MutableList(n + 1) { MutableList(n + 1) { 0 } }
//
//    for (i in 0 until q) {
//        val (ti, ai, bi) = readInts()
//        when (ti) {
//            1 -> {
//                matrix[ai][bi] = 1
//            }
//            2 -> {
//                matrix[ai][bi] = 0
//            }
//            3 -> {
//                if (matrix[ai][bi] == 1 && matrix[bi][ai] == 1) {
//                    println("Yes")
//                } else {
//                    println("No")
//                }
//            }
//        }
//    }

    val (n, q) = readInts()

    val map = mutableMapOf<Int, MutableMap<Int, Int>>()

    for (i in 0 until q) {
        val (ti, ai, bi) = readInts()
        when (ti) {
            1 -> {
                val tmp = map[ai] ?: mutableMapOf()
                tmp[bi] = 1
                map[ai] = tmp
            }
            2 -> {
                val tmp = map[ai] ?: mutableMapOf()
                tmp[bi] = 0
                map[ai] = tmp
            }
            3 -> {
                val AContainsB = (map[ai]?.get(bi)) ?: 0
                val BContainsA = (map[bi]?.get(ai)) ?: 0
                if (AContainsB == 1 && BContainsA == 1) {
                    println("Yes")
                } else {
                    println("No")
                }
            }
        }
    }
}

fun solveABC278B() {
    val (h, m) = readInts()

    var tmpH = h
    var tmpM = m
    while (tmpH in 0..23) {
        if (tmpH != h) {
            // 初回以外は分をリセット
            tmpM = 0
        }

        // tmpH時の各分を判定
        while (tmpM in 0..59) {
            val a = tmpH.toString().padStart(2, '0')[0]
            val b = tmpH.toString().padStart(2, '0')[1]
            val c = tmpM.toString().padStart(2, '0')[0]
            val d = tmpM.toString().padStart(2, '0')[1]
            if ("$a$b".toInt() in 0..23 && "$c$d".toInt() in 0..59
                && "$a$c".toInt() in 0..23 && "$b$d".toInt() in 0..59
            ) {
                println("$tmpH $tmpM")
                return
            }

            tmpM++
        }

        tmpH = if (tmpH == 23) 0 else tmpH + 1
    }
}

fun solveABC278A() {
    val (n, k) = readInts()
    val a = readInts()

    repeat(k) {
        a.removeAt(0)
        a.add(0)
    }

    println(a.joinToString(" "))
}