import kotlin.math.pow

class _library {
    private fun readLn() = readLine()!!
    private fun readStrings() = readLn().split(" ").toMutableList()
    private fun readInt() = readLn().toInt()
    private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
    private fun readLong() = readLn().toLong()
    private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

    fun bitSerarch() {
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
}