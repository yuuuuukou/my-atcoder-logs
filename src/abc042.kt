fun main(args: Array<String>) {
    solveABC042B()
}

fun solveABC042B() {
    val (n, /* l */_) = readLine()!!.split(" ").map { it.toInt() }

    val list = mutableListOf<String>()
    for (i in 0 until n) {
        list.add(readLine()!!)
    }
    list.sort()
    println(list.joinToString(""))
}

fun solveABC042A() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    var cnt5 = 0
    var cnt7 = 0

    if (a == 5) {
        cnt5++
    } else if (a == 7) {
        cnt7++
    }

    if (b == 5) {
        cnt5++
    } else if (b == 7) {
        cnt7++
    }

    if (c == 5) {
        cnt5++
    } else if (c == 7) {
        cnt7++
    }

    if (cnt5 == 2 && cnt7 == 1) {
        println("YES")
    } else {
        println("NO")
    }
}