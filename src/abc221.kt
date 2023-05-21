import kotlin.math.max

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC221C()
}

fun solveABC221C() {
    val n = readString().toMutableList().map { it.toString().toInt() }.sorted().toMutableList()

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
    do {
        for (i in 1 .. n.lastIndex) {
            val num1 = n.subList(0, i)
            val num2 = n.subList(i, n.size)
            if (num1[0] == 0 || num2[0] == 0) {
                // ng
                continue
            }
            res = max(res, num1.joinToString("").toInt() * num2.joinToString("").toInt())
        }
    } while (nextPermutation(n))

    println(res)
}

fun solveABC221B() {
    val s = readString()
    val t = readString()

    if (s == t) {
        println("Yes")
        return
    }

    for (i in 0..s.length - 2) {
        var tmpString = ""
        if (i != 0) {
            val tmpL = s.substring(0 until i)
            tmpString += tmpL
        }

        val tmpSwapL = s.substring(i..i)
        val tmpSwapR = s.substring(i + 1..i + 1)
        tmpString += tmpSwapR + tmpSwapL

        if (s.length > 3) {
            val tmpR = s.substring(i + 2..s.lastIndex)
            tmpString += tmpR
        }

        if (tmpString == t) {
            println("Yes")
            return
        }
    }

    println("No")
}

fun solveABC221A() {
    val (a, b) = readInts()
    var res = 1
    for (i in b until a) {
        res *= 32
    }
    println(res)
}