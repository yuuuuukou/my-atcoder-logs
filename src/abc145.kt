import kotlin.math.pow
import kotlin.math.sqrt

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC145A()
}

fun solveABC145C() {
    val n = readInt()
    val list = mutableListOf<Pair<Int, Int>>()
    val permutation = mutableListOf<Int>()
    repeat(n) {
        val (xi, yi) = readInts()
        list.add(xi to yi)
        permutation.add(it + 1)
    }

    var tmpDistance = 0.0
    var cnt = 0
    do {
        for (i in 0 until permutation.lastIndex) {
            val fromIndex = permutation[i] - 1
            val toIndex = permutation[i + 1] - 1
            tmpDistance += calcDistance(list[fromIndex], list[toIndex])
        }
        cnt++
    } while (nextPermutation(permutation))

    println(tmpDistance / cnt.toDouble())
}

private fun calcDistance(i: Pair<Int, Int>, j: Pair<Int, Int>): Double {
    return sqrt((i.first - j.first).toDouble().pow(2.0) + (i.second - j.second).toDouble().pow(2.0))
}

/**
 * next_permutation
 * コードの参考: https://koboshi-kyopro.hatenablog.com/entry/2021/07/21/193611
 * コメントの参考: https://qiita.com/Nikkely/items/0ddca51b3c0e60afbaab
 */
fun nextPermutation(array: MutableList<Int>): Boolean {
    // i: array[i] < array[i + 1]を満たすもののうち最大のものを探す。のでdownToでループ
    for (i in array.lastIndex - 1 downTo 0) {
        if (array[i] < array[i + 1]) {
            // j: 末尾から探索して初めて現れるarray[i]より大きい要素のインデックスを探す。
            for (j in array.lastIndex downTo i + 1) {
                if (array[j] > array[i]) {
                    // 見つけた。array[i]とarray[j]を入れ替える
                    val tmp = array[i]
                    array[i] = array[j]
                    array[j] = tmp

                    // i+1以降の要素を昇順に並べ替える
                    // i番目までは入れ替え済みor関係ないので、i+1番目からをtaleLastで取得してソート
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

fun solveABC145A() {
    val r = readInt()
    println(r * r)
}