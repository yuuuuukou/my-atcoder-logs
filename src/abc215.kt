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
    solveABC215C()
}

fun solveABC215C() {
    val (s, k) = readStrings()

    fun nextPermutation(array: MutableList<String>): Boolean {
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

    val list = mutableListOf<String>()
    for (si in s) {
        list.add(si.toString())
    }
    list.sort()
    for (i in 1 until k.toInt()) {
        nextPermutation(list)
    }

    println(list.joinToString(""))
}

fun solveABC215B() {
    val n = readLine()!!.toLong()

    var a = 2L
    var cnt = 0
    while (a <= n) {
        a *= 2
        cnt++
    }

    println(cnt)
}

fun solveABC215A() {
    val s = readLine()!!

    if (s == "Hello,World!") {
        println("AC")
    } else {
        println("WA")
    }
}
