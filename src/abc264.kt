fun main(args: Array<String>) {
    solveABC264C()
}

fun solveABC264C() {
//    val (h1, w1) = readLine()!!.split(" ").map { it.toInt() }
//    val matrixA: MutableList<MutableList<Long>> = mutableListOf()
//    for (i in 0 until h1) {
//        matrixA.add(readLine()!!.split(" ").map { it.toLong() }.toMutableList())
//    }
//
//    val (h2, w2) = readLine()!!.split(" ").map { it.toInt() }
//    val matrixB: MutableList<MutableList<Long>> = mutableListOf()
//    for (i in 0 until h2) {
//        matrixB.add(readLine()!!.split(" ").map { it.toLong() }.toMutableList())
//    }
//
//    // h1行w1列をh2行w2列にする
//    // -> 一致するものがあるのであれば、h2 - h1行までの間に0行目として扱う行があるはず
//    // -> w2列にするのであれば、少なくともw2個は一致する列があるはず
//    val start = mutableListOf<Int>()
//    for (rowA in 0..h1 - h2) {
//        for (rowB in 0 until h2) {
//            if (matrixA[rowA].containsAll(matrixB[rowB])) {
//                // 開始行の候補になるのでメモっておく
//                start.add(rowA)
//            }
//        }
//    }
//
//    for (row in start.indices) {
//        // rowを先頭行とした時のMatrixA
//        val tmpMatrixA = matrixA.toMutableList()
//
//        // 先に必要と思われる列に絞る
//        var col = 0
//        while (tmpMatrixA[row].size != matrixB[row].size) {
//            if (col == matrixB[row].size) {
//                break
//            }
//            if (tmpMatrixA[row][col] == matrixB[row][col]) {
//                col++
//            } else {
//                // 不一致なら消す
//                for (row in tmpMatrixA.indices) {
//                    tmpMatrixA[row].removeAt(col)
//                }
//            }
//        }
//
//        // この時点で列数があってなければ該当なし
//        if (tmpMatrixA[0].size != matrixB[0].size) {
//            continue
//        }
//
//        // tmpMatrixAから不要な行を削る
//        var row = 0
//        while (tmpMatrixA.size != matrixB.size) {
//            if (row == matrixB.size) {
//                break
//            }
//            if (tmpMatrixA[row][0] == matrixB[row][0]) {
//                row++
//            } else {
//                // 不一致なら消す
//                tmpMatrixA.removeAt(row)
//            }
//        }
//
//        // この時点で列数があっていれば該当あり
//        if (tmpMatrixA.size == matrixB.size) {
//            println("Yes")
//            return
//        }
//    }
//    println("No")
}

fun solveABC264B() {
    val (r, c) = readLine()!!.split(" ").map { it.toInt() }

    val black = "black"
    val white = "white"

    when (r) {
        1, 15 -> {
            println(black)
        }
        2, 14 -> {
            when (c) {
                1, 15 -> println(black)
                else -> println(white)
            }
        }
        3, 13 -> {
            when (c) {
                2, 14 -> println(white)
                else -> println(black)
            }
        }
        4, 12 -> {
            when (c) {
                1, 3, 13, 15 -> println(black)
                else -> println(white)
            }
        }
        5, 11 -> {
            when (c) {
                2, 4, 12, 14 -> println(white)
                else -> println(black)
            }
        }
        6, 10 -> {
            when (c) {
                1, 3, 5, 11, 13, 15 -> println(black)
                else -> println(white)
            }
        }
        7, 9 -> {
            when (c) {
                2, 4, 6, 10, 12, 14 -> println(white)
                else -> println(black)
            }
        }
        8 -> {
            when (c) {
                1, 3, 5, 7, 9, 11, 13, 15 -> println(black)
                else -> println(white)
            }
        }
    }
}

fun solveABC264A() {
    val (l, r) = readLine()!!.split(" ").map { it.toInt() }
    println("atcoder".substring(l - 1, r))
}
