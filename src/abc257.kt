private fun readString() = readLine()!!
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
    solveABC257B()
}

fun solveABC257B() {
    val (n, k, q) = readInts()
    val a = readInts()
    val l = readInts()

    for (li in l) {
        // li番目のコマを対象にする
        var target = a[li - 1]

        if (li == k) {
            // 最後のコマは終端を考慮
            if (target == n) {
                // 最後のマスに居ればそのまま
                continue
            }
        } else {
            // 最後以外のコマは次のコマの位置を考慮
            val next = a[li]
            if (target + 1 == next) {
                // 移動できないのでそのまま
                continue
            }
        }

        // ここまで到達する = 次に進めてOK
        a[li - 1] += 1
    }

    println(a.joinToString(" ", "", ""))
}

fun solveABC257A() {
    val (n, x) = readInts()

    var current = "A"
    var nowNum = 0
    while (true) {
        for (i in 1..n) {
            nowNum += 1

            if (nowNum == x) {
                println(current)
                return
            }
        }
        current = (current.toCharArray()[0] + 1).toString()
    }
}