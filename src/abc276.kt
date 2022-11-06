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
    solveABC276C()
}

fun solveABC276C() {
    /*val n =*/ readInt()
    val p = readInts()

    prevPermutation(p)
    println(p.joinToString(" ", "", ""))
}

/**
 * prev_permutation
 * 受け取ったリストの前の順列にarrayを更新する
 * [1, 2, 3, 5, 4] -> [1, 2, 3, 4, 5]
 *
 * nextPermutationをベースに不等号、ソート順を修正
 */
private fun prevPermutation(array: MutableList<Int>): Boolean {
    // i: array[i] > array[i + 1]を満たすもののうちインデックス最大のものを探す。のでdownToでループ
    for (i in array.lastIndex - 1 downTo 0) {
        if (array[i] > array[i + 1]) {
            // j: 末尾から探索して初めて現れるarray[i]より値が小さい要素のインデックスを探す。
            for (j in array.lastIndex downTo i + 1) {
                if (array[j] < array[i]) {
                    // 見つけた。array[i]とarray[j]を入れ替える
                    val tmp = array[i]
                    array[i] = array[j]
                    array[j] = tmp

                    // i+1以降の要素を降順に並べ替える
                    // i番目までは入れ替え済みor関係ないので、i+1番目からをtakeLastで取得してソート
                    val tmpArray = array.takeLast(array.size - (i + 1)).sortedDescending()
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

fun solveABC276B() {
    val (n, m) = readInts()
    val map = mutableMapOf<Int, MutableList<Int>>()
    for (i in 0 until m) {
        val (ai, bi) = readInts()

        var tmp = map[ai] ?: mutableListOf()
        tmp.add(bi)
        map[ai] = tmp

        var tmp2 = map[bi] ?: mutableListOf()
        tmp2.add(ai)
        map[bi] = tmp2
    }

    for (i in 1..n) {
        val tmp = map[i]?.sorted() ?: mutableListOf()

        var res = StringBuilder("${tmp.count()} ")
        for (item in tmp) {
            res.append("$item ")
        }
        res.trimEnd(' ')
        println(res)
    }
}

fun solveABC276A() {
    val s = readString()
    var res = -1
    for ((index, si) in s.withIndex()) {
        if (si.toString() == "a") {
            res = index + 1
        }
    }
    println(res)
}
