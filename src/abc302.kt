import kotlin.math.absoluteValue

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
    solveABC302D()
}

fun solveABC302D() {
    val (n, m, d) = readLongs()
    val a = readLongs().sorted().toMutableList()
    val b = readLongs().sorted().toMutableList()

    // 価値を最大にしつつ差をd以下にしたい できなければ-1
    while (true) {
        if (a.isEmpty() || b.isEmpty()) {
            println("-1")
            return
        }

        if ((a[a.lastIndex] - b[b.lastIndex]).absoluteValue <= d) {
            println((a[a.lastIndex] + b[b.lastIndex]).absoluteValue)
            return
        }

        // 大きい方はどうしようもないので捨てる
        if (a[a.lastIndex] < b[b.lastIndex]) {
            b.removeAt(b.lastIndex)
        } else {
            a.removeAt(a.lastIndex)
        }
    }
}

fun solveABC302C() {
    val (n, m) = readInts()

    /**
     * next_permutation
     * 受け取ったリストの次の順列にarrayを更新する
     * [1, 2, 3, 4, 5] -> [1, 2, 3, 5, 4]
     *
     * コードの参考: https://koboshi-kyopro.hatenablog.com/entry/2021/07/21/193611
     * コメントの参考: https://qiita.com/Nikkely/items/0ddca51b3c0e60afbaab
     */
    fun nextPermutation(array: MutableList<Int>): Boolean {
        // i: array[i] < array[i + 1]を満たすもののうちインデックス最大のものを探す。のでdownToでループ
        for (i in array.lastIndex - 1 downTo 0) {
            if (array[i] < array[i + 1]) {
                // j: 末尾から探索して初めて現れるarray[i]より値が大きい要素のインデックスを探す。
                for (j in array.lastIndex downTo i + 1) {
                    if (array[j] > array[i]) {
                        // 見つけた。array[i]とarray[j]を入れ替える
                        val tmp = array[i]
                        array[i] = array[j]
                        array[j] = tmp

                        // i+1以降の要素を昇順に並べ替える
                        // i番目までは入れ替え済みor関係ないので、i+1番目からをtakeLastで取得してソート
                        val tmpArray = array.takeLast(array.size - (i + 1)).sorted()
                        tmpArray.forEachIndexed { index, e ->
                            // tmpArrayのindex == arrayのi+1+indexなので、ソート済みの値で上書きしていく
                            array[i + 1 + index] = e
                        }

                        return true
                    }
                }
            }
        }
        return false
    }

    val matrix = mutableListOf<String>()
    repeat(n) {
        val si = readString()
        matrix.add(si)
    }

    val indexList = (0 until n).toMutableList()

    var ok1 = false
    do {
        var ok2 = true
        for ((i, index) in indexList.withIndex()) {
            if (i == indexList.lastIndex) break
            var diffCnt = 0
            for (j in 0 until m) {
                if (matrix[index][j] != matrix[indexList[i + 1]][j]) {
                    diffCnt++
                }
            }
            if (diffCnt <= 1) {
                // ok
            } else {
                // ng
                ok2 = false
            }
        }
        if (ok2) ok1 = true
    } while (nextPermutation(indexList))

    println(if (ok1) "Yes" else "No")
}

fun solveABC302B() {
    val (h, w) = readInts()

    val matrix = mutableListOf<String>()
    repeat(h) {
        val si = readString()
        matrix.add(si)
    }

    for ((i, row) in matrix.withIndex()) {
        for ((j, cell) in row.withIndex()) {
            if (cell == 's') {
                // 横
                if (j + 4 < w
                    && matrix[i][j] == 's'
                    && matrix[i][j + 1] == 'n'
                    && matrix[i][j + 2] == 'u'
                    && matrix[i][j + 3] == 'k'
                    && matrix[i][j + 4] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1} ${j + 1 + 1}")
                    println("${i + 1} ${j + 1 + 2}")
                    println("${i + 1} ${j + 1 + 3}")
                    println("${i + 1} ${j + 1 + 4}")
                }

                if (j - 4 >= 0
                    && matrix[i][j] == 's'
                    && matrix[i][j - 1] == 'n'
                    && matrix[i][j - 2] == 'u'
                    && matrix[i][j - 3] == 'k'
                    && matrix[i][j - 4] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1} ${j + 1 - 1}")
                    println("${i + 1} ${j + 1 - 2}")
                    println("${i + 1} ${j + 1 - 3}")
                    println("${i + 1} ${j + 1 - 4}")
                }

                // 縦
                if (i + 4 < h
                    && matrix[i][j] == 's'
                    && matrix[i + 1][j] == 'n'
                    && matrix[i + 2][j] == 'u'
                    && matrix[i + 3][j] == 'k'
                    && matrix[i + 4][j] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1 + 1} ${j + 1}")
                    println("${i + 1 + 2} ${j + 1}")
                    println("${i + 1 + 3} ${j + 1}")
                    println("${i + 1 + 4} ${j + 1}")
                }

                if (i - 4 >= 0
                    && matrix[i][j] == 's'
                    && matrix[i - 1][j] == 'n'
                    && matrix[i - 2][j] == 'u'
                    && matrix[i - 3][j] == 'k'
                    && matrix[i - 4][j] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1 - 1} ${j + 1}")
                    println("${i + 1 - 2} ${j + 1}")
                    println("${i + 1 - 3} ${j + 1}")
                    println("${i + 1 - 4} ${j + 1}")
                }

                // ななめ
                if (i + 4 < h && j + 4 < w
                    && matrix[i][j] == 's'
                    && matrix[i + 1][j + 1] == 'n'
                    && matrix[i + 2][j + 2] == 'u'
                    && matrix[i + 3][j + 3] == 'k'
                    && matrix[i + 4][j + 4] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1 + 1} ${j + 1 + 1}")
                    println("${i + 1 + 2} ${j + 1 + 2}")
                    println("${i + 1 + 3} ${j + 1 + 3}")
                    println("${i + 1 + 4} ${j + 1 + 4}")
                }

                if (i - 4 >= 0 && j - 4 >= 0
                    && matrix[i][j] == 's'
                    && matrix[i - 1][j - 1] == 'n'
                    && matrix[i - 2][j - 2] == 'u'
                    && matrix[i - 3][j - 3] == 'k'
                    && matrix[i - 4][j - 4] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1 - 1} ${j + 1 - 1}")
                    println("${i + 1 - 2} ${j + 1 - 2}")
                    println("${i + 1 - 3} ${j + 1 - 3}")
                    println("${i + 1 - 4} ${j + 1 - 4}")
                }

                if (i - 4 >= 0 && j + 4 < w
                    && matrix[i][j] == 's'
                    && matrix[i - 1][j + 1] == 'n'
                    && matrix[i - 2][j + 2] == 'u'
                    && matrix[i - 3][j + 3] == 'k'
                    && matrix[i - 4][j + 4] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1 - 1} ${j + 1 + 1}")
                    println("${i + 1 - 2} ${j + 1 + 2}")
                    println("${i + 1 - 3} ${j + 1 + 3}")
                    println("${i + 1 - 4} ${j + 1 + 4}")
                }

                if (i + 4 < h && j - 4 >= 0
                    && matrix[i][j] == 's'
                    && matrix[i + 1][j - 1] == 'n'
                    && matrix[i + 2][j - 2] == 'u'
                    && matrix[i + 3][j - 3] == 'k'
                    && matrix[i + 4][j - 4] == 'e'
                ) {
                    println("${i + 1} ${j + 1}")
                    println("${i + 1 + 1} ${j + 1 - 1}")
                    println("${i + 1 + 2} ${j + 1 - 2}")
                    println("${i + 1 + 3} ${j + 1 - 3}")
                    println("${i + 1 + 4} ${j + 1 - 4}")
                }
            }
        }
    }
}

fun solveABC302A() {
    var (a, b) = readLongs()
    if (a % b == 0L) {
        println(a / b)
    } else {
        println(a / b + 1)
    }
}
