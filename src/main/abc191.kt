package main

fun main(args: Array<String>) {
    solveABC191C()
}

fun solveABC191C() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }


    val matrix = mutableListOf<List<String>>()
    for (i in 0 until h) {
        val row = readLine()!!.split("")
        // 空文字スプリットで先頭末尾に空文字が入ってしまうので消したうえでマトリクス化
        matrix.add(row.drop(1).dropLast(1))
    }

    var result = 0

    for (row in 0 until h) {
        for (col in 0 until w) {

            // 外周の白は影響しないのでスキップ
            if (row == 0 || row == h - 1 || col == 0 || col == w - 1) {
                continue
            }

            val currentCell = matrix[row][col]
            val leftCell = matrix[row][col - 1]
            val rightCell = matrix[row][col + 1]
            val topCell = matrix[row - 1][col]
            val bottomCell = matrix[row + 1][col]

            if (currentCell == "#") {
                // 黒の場合
                // 白と４つ隣接：四角形
                // 白と３つ隣接：角が２つ(外側に出っ張る)
                // 白と２つ隣接：角が１つ(外側に出っ張る) *上下のようなケースは角をなさないので除外
                // 白と１つ隣接：角無し
                // 白と隣接無し：角無し
                var white = 0
                if (leftCell == ".") white++
                if (rightCell == ".") white++
                if (topCell == ".") white++
                if (bottomCell == ".") white++

                if (white == 4) {
                    result += 4
                } else if (white == 3) {
                    result += 2
                } else if (white == 2) {
                    if (topCell == "." && bottomCell == "."
                            || leftCell == "." && rightCell == ".") {
                        // 角をなさない
                    } else {
                        result += 1
                    }
                }

            } else if (currentCell == ".") {
                // 白の場合
                // 黒と３つ隣接：角が２つ(内側にくぼむ)
                // 黒と２つ隣接：角が１つ(内側にくぼむ)
                // 黒と１つ隣接：角無し
                // 黒と隣接無し：角無し
                var black = 0
                if (leftCell == "#") black++
                if (rightCell == "#") black++
                if (topCell == "#") black++
                if (bottomCell == "#") black++

                if (black == 3) {
                    result += 2
                } else if (black == 2) {
                    if (topCell == "#" && bottomCell == "#"
                            || leftCell == "#" && rightCell == "#") {
                        // 角をなさない
                    } else {
                        result += 1
                    }
                }
            }
        }
    }

    print(result)
}

fun solveABC191B() {
    val (_, x) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }

    var outputted = false
    for (ai in a) {
        if (ai != x) {
            if (outputted) {
                print(" $ai")
            } else {
                print(ai)
                outputted = true
            }
        }
    }
}

fun solveABC191A() {
    // v: 速さ
    // t: 消える視点
    // s: 消える終点
    // d: ここで消えていなければ打てる
    val (v, t, s, d) = readLine()!!.split(" ").map { it.toLong() }

    if (d < (v * t) || d > (v * s)) {
        println("Yes")
    } else {
        println("No")
    }
}
