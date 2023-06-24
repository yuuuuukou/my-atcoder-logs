private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC093C()
}

fun solveABC093C() {
    var abc = readInts().sorted().toMutableList()

    var cnt = 0
    while (abc[0] != abc[1] || abc[1] != abc[2] || abc[2] != abc[0]) {
        if (abc[0] + 2 <= abc[2]) {
            abc[0] += 2
        } else {
            abc[0] += 1
            abc[1] += 1
        }
        cnt++
        abc.sort()
    }

    println(cnt)
}

fun solveABC093B() {
    val (a, b, k) = readInts()
    for (i in a..b) {
        if (i in a until a + k || i in b - k + 1..b) {
            println(i)
        }
    }
}

fun solveABC093A() {
    val s = readLn()
    if (s.contains("a") && s.contains("b") && s.contains("c")) {
        println("Yes")
    } else {
        println("No")
    }
}