package main

fun main(args: Array<String>) {
    solveABC139B()
}

private fun solveABC139B() {
    // a: 電源タップの口数
    // b: b口以上にしたい
    // *: 最初は1口
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    var port = 1
    var tapCnt = 0
    while (port < b) {
        port += (a - 1)
        tapCnt++
    }

    print(tapCnt)
}