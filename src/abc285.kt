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
    solveABC285D()
}

fun solveABC285D() {
    val n = readInt()

    val st = mutableMapOf<String, String>()
    val current = mutableMapOf<String, Int>()
    repeat(n) {
        val (si, ti) = readStrings()
        st[si] = ti
        current[si] = 1
    }

    val loopMemo = mutableMapOf<String, Int>()
    fun changeID(
        from: String,
        to: String,
        st: MutableMap<String, String>,
        current: MutableMap<String, Int>
    ) {
        if (loopMemo.containsKey(from)) {
            // 循環、例外としてNGを返す
            throw java.lang.Exception()
        }

        // 変更可能かチェック
        if (current.containsKey(to)) {
            loopMemo[from] = 1
            // 重複、重複している先の変更が可能か確認
            changeID(to, st[to]!!, st, current)

            // 処理したうえで変更可能か再度チェック
            if (current.containsKey(to)) {
                // 例外としてNGを返す
                throw java.lang.Exception()
            } else {
                // 可能、更新する
                current[to] = 1
                current.remove(from)

                // 更新済みなので更新予定のリストから削除
                st.remove(from)
            }
        } else {
            // 可能、更新する
            current[to] = 1
            current.remove(from)

            // 更新済みなので更新予定のリストから削除
            st.remove(from)
        }
    }

    while (st.isNotEmpty()) {
        try {
            var si = ""
            var ti = ""
            for (item in st) {
                si = item.key
                ti = item.value
                break
            }
            changeID(si, ti, st, current)
        } catch (e: java.lang.Exception) {
            // 再帰中のNGを例外として受け取る
            println("No")
            return
        }
    }

    println("Yes")
}

fun solveABC285C() {
    val s = readString()

    var digit = 1L
    var cnt = 0L
    for (i in s.lastIndex downTo 0) {
        val tmp = when (s[i]) {
            'A' -> 1
            'B' -> 2
            'C' -> 3
            'D' -> 4
            'E' -> 5
            'F' -> 6
            'G' -> 7
            'H' -> 8
            'I' -> 9
            'J' -> 10
            'K' -> 11
            'L' -> 12
            'M' -> 13
            'N' -> 14
            'O' -> 15
            'P' -> 16
            'Q' -> 17
            'R' -> 18
            'S' -> 19
            'T' -> 20
            'U' -> 21
            'V' -> 22
            'W' -> 23
            'X' -> 24
            'Y' -> 25
            'Z' -> 26
            else -> 0
        }
        cnt += tmp * digit

        digit *= 26
    }

    println(cnt)
}

fun solveABC285B() {
    val n = readInt()
    val s = readString()

    // i文字飛ばし
    for (i in 1 until n) {
        var cnt = 0

        // j番目をチェック
        var j = 0
        while (true) {
            if (j >= n || j + i >= n) break
            if (s[j] != s[j + i]) {
                cnt++
            } else {
                break
            }
            j++
        }

        println(cnt)
    }
}

fun solveABC285A() {
    val (a, b) = readInts()
    when (a) {
        1 -> if (b in arrayOf(2, 3)) println("Yes") else println("No")
        2 -> if (b in arrayOf(1, 4, 5)) println("Yes") else println("No")
        3 -> if (b in arrayOf(1, 6, 7)) println("Yes") else println("No")
        4 -> if (b in arrayOf(2, 8, 9)) println("Yes") else println("No")
        5 -> if (b in arrayOf(2, 10, 11)) println("Yes") else println("No")
        6 -> if (b in arrayOf(3, 12, 13)) println("Yes") else println("No")
        7 -> if (b in arrayOf(3, 14, 15)) println("Yes") else println("No")
        8 -> if (b in arrayOf(4)) println("Yes") else println("No")
        9 -> if (b in arrayOf(4)) println("Yes") else println("No")
        10 -> if (b in arrayOf(5)) println("Yes") else println("No")
        11 -> if (b in arrayOf(5)) println("Yes") else println("No")
        12 -> if (b in arrayOf(6)) println("Yes") else println("No")
        13 -> if (b in arrayOf(6)) println("Yes") else println("No")
        14 -> if (b in arrayOf(7)) println("Yes") else println("No")
        15 -> if (b in arrayOf(7)) println("Yes") else println("No")
    }
}