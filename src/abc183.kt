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
    solveABC183C()
}

fun solveABC183C() {
    val (n, k) = readInts()
    val t = mutableListOf<MutableList<Int>>()
    repeat(n) {
        val ti = readInts()
        t.add(ti)
    }

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

    var res = 0
    val permutation = MutableList(n - 1) { i -> i + 2 }
    do {
        var sum = 0
        val path = MutableList(1) { 1 }
        path.addAll(permutation)
        for (i in path.indices) {
            val from = path[i]
            val to = if (i == path.lastIndex) 1 else path[i + 1]

            sum += t[from - 1][to - 1]
        }
        if (sum == k) res++
    } while (nextPermutation(permutation))

    println(res)
}

fun solveABC183B() {
    val (sx, sy, gx, gy) = readDoubles()

    // (a,b), (c,d)の直線の傾き
    // -> d-b / c-a

    // 傾きa = x - sx / 0 - sy
    // 傾きb = gx - x / gy - 0
    // a = -b
    // -> x - sx / 0 - sy = -(gx - x /  gy - 0)
    // -> ...
    // -> x = (sy * gx + gy * sx) / (gy + sy)

    println((sy * gx + gy * sx) / (gy + sy))
}

fun solveABC183A() {
    val x = readInt()
    if (x >= 0) {
        println(x)
    } else {
        println(0)
    }
}