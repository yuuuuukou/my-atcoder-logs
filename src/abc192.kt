import kotlin.math.pow
import kotlin.system.exitProcess

fun main(args: Array<String>) {
//    solveABC192D()
}

// FIXME:Incorrect answer
fun solveABC192D() {
    val x = readLine()!!
    val m = readLine()!!.toLong()

    val preD = x.split("").sortedDescending()
    val d = preD[0].toInt()

    var cnt = 0
    var n = d + 1
    while (true) {
        // x を d+1 進数 におきかえ
        var num = 0L
        val a = x.split("").reversed()
        for (i in a.indices) {
            if (a[i] == "") continue

            num += a[i].toInt() * n.toDouble().pow(i - 1).toLong()
        }

        if (num <= m) {
            n++
            cnt++
        } else {
            break
        }
    }

    println(cnt)
}

fun solveABC192C() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    var before = n
    for (i in 0..k) {
        if (i == 0) {
            continue
        }

        // g1x
        val g1xPre = before.toString().split("").sortedDescending()
        var g1xPre2 = ""
        for (j in g1xPre) {
            g1xPre2 += j
        }
        val g1x = g1xPre2.toInt()

        // g2x
        val g2xPre = before.toString().split("").sorted()
        var g2xPre2 = ""
        for (j in g2xPre) {
            if (j == "0") {
                continue
            } else {
                g2xPre2 += j
            }
        }
        if (g2xPre2 == "") g2xPre2 = "0"
        val g2x = g2xPre2.toInt()

        // fx
        val fx = g1x - g2x
        before = fx
    }
    print(before)
}

fun solveABC192B() {
    val s = readLine()!!

    for (i in s.indices) {
        if ((i + 1) % 2 == 0) {
            if (s[i].toString() == s[i].toString().toUpperCase()) {
                // 読みづらいかも
            } else {
                println("No")
                exitProcess(0)
            }
        } else {
            if (s[i].toString() == s[i].toString().toLowerCase()) {
                // 読みづらいかも
            } else {
                println("No")
                exitProcess(0)
            }
        }
    }

    println("Yes")
}

fun solveABC192A() {
    val x = readLine()!!.toInt()

    println(100 - (x % 100))
}
