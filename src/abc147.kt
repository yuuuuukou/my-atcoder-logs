import kotlin.math.max
import kotlin.math.pow

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC147C()
}

fun solveABC147C() {
    val n = readInt()

    val list = mutableListOf<MutableMap<Int, Int>>()
    repeat(n) {
        val ai = readInt()
        val map = mutableMapOf<Int, Int>()
        repeat(ai) {
            val (xi, yi) = readInts()
            map[xi - 1] = yi
        }
        list.add(map)
    }

    var res = 0

    val pattern = 2.0.pow(n).toInt()
    for (bit in 0 until pattern) {
        // ビットリスト trueならi人目を正直者として仮定
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

        var flg = true
        for (i in 0 until n) {
            // tmpList[i]は現時点の証言 nullで無ければ既に証言がある
            // bits[i]は仮定 trueなら正直者仮定
            // -> 証言があって、かつ仮定とずれるのであれば、矛盾あり
            if (tmpList[i] != null && tmpList[i] != bits[i]) {
                flg = false
            }

            if (!bits[i]) {
                // 矛盾は無いけど真偽不明なのでスルー
                continue
            }

            for (item in list[i]) {
                // 人iの証言リスト(list[i])を正しいものとしてtmpListに設定していく
                if (item.value == 1) {
                    // 正直者想定
                    if (tmpList[item.key] == null) {
                        tmpList[item.key] = true
                    } else {
                        if (tmpList[item.key] == true) {
                            // 証言と一致 ok
                        } else {
                            // 既存の証言と一致しない ng
                            flg = false
                        }
                    }
                } else {
                    if (tmpList[item.key] == null) {
                        tmpList[item.key] = false
                    } else {
                        if (tmpList[item.key] == false) {
                            // 証言と一致 ok
                        } else {
                            // 既存の証言と一致しない ng
                            flg = false
                        }
                    }
                }
            }
        }
        if (flg) {
            res = max(res, bits.count { it })
        }
    }

    println(res)
}