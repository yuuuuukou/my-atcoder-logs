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
    val n = readInt()
    val p = readInts()
//    val permutation = p.sorted().toMutableList()
//
//    var beforePermutation = mutableListOf<Int>()
//    do {
//        if (p == permutation) {
//            println(beforePermutation.joinToString(" ", "", ""))
//        }
//
//        // 事後処理
//        beforePermutation = permutation.toMutableList()
//    } while (nextPermutation(permutation))
    println(prevPermutation(p)?.joinToString(" ", "", ""))
}

fun prevPermutation(nums: MutableList<Int>): List<Int>? {
    var index = nums.size - 2
    // find the first pair of two successive numbers nums[index] and nums[index + 1]
    // from the right, which satisfy nums[index] > [index + 1]
    while (index >= 0 && nums[index] <= nums[index + 1]) {
        index--
    }

    // replace the number nums[index] with the number a[smaller] which is just smaller than itself
    if (index >= 0) {
        var smaller = nums.size - 1
        while (smaller >= 0 && nums[index] <= nums[smaller]) {
            smaller--
        }
        swap(nums, index, smaller)
    }
    // reverse the numbers following a[index] to get the next smallest lexicographic permutation
    reverse(nums, index + 1)
    return nums
}

private fun reverse(nums: MutableList<Int>, start: Int) {
    var i = start
    var j = nums.size - 1
    while (i < j) {
        swap(nums, i, j)
        i++
        j--
    }
}

private fun swap(nums: MutableList<Int>, i: Int, j: Int) {
    val temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}

/**
 * next_permutation
 * コードの参考: https://koboshi-kyopro.hatenablog.com/entry/2021/07/21/193611
 * コメントの参考: https://qiita.com/Nikkely/items/0ddca51b3c0e60afbaab
 */
private fun nextPermutation(array: MutableList<Int>): Boolean {
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
