fun main(args: Array<String>) {
    solveABC199C()
}

fun solveABC199C() {
    // n: 文字列の長さが2N
    val n = readLine()!!.toInt()
    // s: 文字列S
    val s = readLine()!!
    // q: クエリの個数
    val q = readLine()!!.toInt()
    // ti: 1ならSのai文字目とbi文字目を入れ替え
    //     2ならsの前半N文字と後半N文字を入れ替え
    var res = s
    for (i in 0 until q) {
        val (t, a, b) = readLine()!!.split(" ").map { it.toInt() }
        if (t == 1) {
            val beforeA = res.substring(0 until a - 1)
            val sa = res.substring(a - 1, a)
            val beforeB = res.substring(a until b - 1)
            val sb = res.substring(b - 1, b)
            val afterB = res.substring(b until s.length)
            res = beforeA + sb + beforeB + sa + afterB
        } else /*if (t == 2)*/ {
            res = res.substring(n until 2 * n) + res.substring(0 until n)
        }
    }

    println(res)
}

fun solveABC199B() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }

    var res = 1000
    for (x in 1..1000) {
        for (j in 0 until n) {
            if (x >= a[j] && x <= b[j]) {
                // ok
            } else {
                // ng
                res--
                break
            }
        }
    }
    println(res)
}

fun solveABC199A() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    if (a * a + b * b < c * c) {
        println("Yes")
    } else {
        println("No")
    }
}
