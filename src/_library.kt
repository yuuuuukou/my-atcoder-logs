import kotlin.math.pow

class _library {
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

    fun bitSearch() {
        val n = 10 // readLine()!!.toInt()

        val pattern = 2.0.pow(n).toInt()
        for (bit in 0 until pattern) {
            // ビットリスト i番目を選ぶ/選ばない の状態を保持
            val bits = mutableListOf<Boolean>()
            // 証言リスト
            val tmpList = MutableList<Boolean?>(n) { null }
            for (i in 0 until n) {
                // bit演算した結果の10進数 ≒ iビット目にビットが立っているか
                val bitAsInt = bit and (1 shl i)
                // 10進数で見て0以上であれば、この桁にbitが立ってる
                if (bitAsInt > 0) {
                    bits.add(true)
                    tmpList[i] = true
                } else {
                    bits.add(false)
                    tmpList[i] = false
                }
            }

            // 状態に応じた処理
        }
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

    /**
     * prev_permutation
     * 受け取ったリストの前の順列にarrayを更新する
     * [1, 2, 3, 5, 4] -> [1, 2, 3, 4, 5]
     *
     * nextPermutationをベースに不等号、ソート順を修正
     * 修正方針の参考：https://qiita.com/HMMNRST/items/26786552a2660735d34f
     */
    fun prevPermutation(array: MutableList<Int>): Boolean {
        // i: array[i] < array[i + 1]を満たすもののうちインデックス最大のものを探す。のでdownToでループ
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
}