private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC160B()
}

fun solveABC160C() {
    val (k, _) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var max = 0

    // 1個前の家との距離
    val list = mutableListOf<Int>()

    for (i in a.indices) {
        val distance =
            if (i == 0) {
                // 初回は末尾要素との距離
                (k - a.last()) + a[i]
            } else {
                // 初回以降は手前要素との距離
                a[i] - a[i - 1]
            }
        list.add(distance)

        max = if (max < distance) distance else max
    }

    // 一番コストかかる経路を端折る
    list.removeAt(list.indexOf(max))
    println(list.sum())
}

fun solveABC160B() {
    var x = readInt()

    var joy = 0
    while (x >= 500) {
        x -= 500
        joy += 1000
    }

    while (x >= 5) {
        x -= 5
        joy += 5
    }

    println(joy)
}

fun solveABC160A() {
    val s = readLn()
    if (s[2] == s[3] && s[4] == s[5]) {
        println("Yes")
    } else {
        println("No")
    }
}