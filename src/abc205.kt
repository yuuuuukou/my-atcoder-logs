fun main(args: Array<String>) {
    solveABC205D()
}

fun solveABC205D() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    val a2 = a.toMutableSet()

    for (i in 1..q) {
        val ki = readLine()!!.toLong()
        val index = a.binarySearch(ki)
        if (index >= 0) {
            // 対象の値がある -> 対象のインデックスが返る
            // [3,5,6,7] 3を渡す -> 0が返る "index"
            // [3,5,6,7] 5を渡す -> 1が返る "index"

            // 対象の数値よりも小さい要素の数
            // 0 -> 1
            // 1 -> 2
            // に変換
            var smallItemCount = index + 1

            while (a2.contains(ki + smallItemCount)) {
                smallItemCount++
            }

            // 小さいのが減ってるので、i番目はその個数を足した値になっている
            println(ki + smallItemCount)
        } else {
            // 対象の値が無ければ、対象の値より大きい最も近い値のindex + 1が負数で返る

            // [3,5,6,7] 2を渡す -> -1が返る "-(大きくて一番近い値のindex + 1)"
            // [3,5,6,7] 4を渡す -> -2が返る "-(大きくて一番近い値のindex + 1)"

            // 対象の数値よりも小さい要素の数
            // -1 -> 0
            // -2 -> 1
            // に変換
            val smallItemCount = (-1 * index) - 1

            // 小さいのが減ってるので、i番目はその個数を足した値になっている
            println(ki + smallItemCount)
        }
    }
}

fun solveABC205C() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toBigDecimal() }

    when {
        a.pow(c.toInt()) == b.pow(c.toInt()) -> {
            println("=")
        }
        a.pow(c.toInt()) < b.pow(c.toInt()) -> {
            println("<")
        }
        else -> {
            println(">")
        }
    }
}

fun solveABC205B() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val aCount = Array(n + 1) { 0 }

    var able = true
    for (ai in a) {
        aCount[ai]++

        if (aCount[ai] > 1) {
            able = false
        }
    }

    println(if (able) "Yes" else "No")
}

fun solveABC205A() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }

    println(a * b / 100.0)
}


//サクラでやってることをvimでできるようにする
//⇒軽量エディタ枠をサクラ→vimへ移行
//・サクラエディタでやってること洗い出し
//・即閉じないようにする(サクラっぽく)or編集時点のものを維持できるようにする(vs codeっぽく)
//
//・必要に応じてvimプラグインを各エディタへ導入
//
//
//
//エラー出てるところを無視できるようにする
//　Androidのとこは自動生成の類じゃん？たぶん