import kotlin.math.pow

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC128B()
}

fun solveABC128B() {
    val n = readInt()

    class Restaurant(val city: String, val score: Int, val no: Int)

    var s = mutableListOf<Restaurant>()
    for (i in 0 until n) {
        val si = readStrings()
        val restaurant = Restaurant(si[0], si[1].toInt(), i + 1)
        s.add(restaurant)
    }
    s.sortWith(compareBy({ it.city }, { -it.score }))

    for (si in s) {
        println(si.no)
    }
}

fun solveABC128C() {
    val (n, m) = readInts()
    val s = mutableListOf<MutableList<Int>>()
    repeat(m) {
        val si = readInts()
        si.removeAt(0)
        s.add(si)
    }
    val p = readInts()

    var res = 0

    // 組み合わせは2^n個になる
    val pattern = 2.0.pow(n).toInt()
    for (bit in 0 until pattern) {
        var bitString = ""
        for (i in 0 until n) {
            // bit演算した結果の10進数 ≒ iビット目にビットが立っているか
            val bitAsInt = bit and (1 shl i)
            // 10進数で見て0以上であれば、この桁にbitが立ってる
            if (bitAsInt > 0) {
                bitString += "1"
            } else {
                bitString += "0"
            }
        }

        // 各電球の点灯確認
        var isTurnOn = true
        for (i in 0 until m) {
            var cnt = 0
            // 電球iに対応するスイッチ
            for (si in s[i]) {
                if (bitString[si - 1].toString() == "1") {
                    cnt++
                }
            }

            if (cnt % 2 != p[i]) {
                // 点灯していない
                isTurnOn = false
            }
        }
        if (isTurnOn) {
            res++
        }
    }
    println(res)
}

fun solveABC128A() {
    val (a, p) = readInts()
    println((a * 3 + p) / 2)
}