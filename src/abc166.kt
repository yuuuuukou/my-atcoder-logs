private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC166C()
}

fun solveABC166C() {
    val (n, m) = readInts()
    val h = readInts()

    val links = MutableList(n + 1) { mutableSetOf<Int>() }

    repeat(m) {
        val (ai, bi) = readInts()
        links[ai].add(bi)
        links[bi].add(ai)
    }

    var cnt = 0
    for (i in 1..n) {
        val target = h[i - 1]
        var isHighest = true
        for (link in links[i]) {
            if (target <= h[link - 1]) {
                isHighest = false
            }
        }

        if (isHighest) cnt++
    }

    println(cnt)
}

fun solveABC166B() {
    val (n, k) = readInts()

    val sunuke = MutableList(n + 1) { 0 }

    repeat(k) {
        val di = readInt()
        val ai = readInts()
        for (aii in ai) {
            sunuke[aii] = 1
        }
    }

    println(sunuke.count { it == 0 } - 1)
}

fun solveABC166A() {
    val s = readLn()
    if (s == "ABC") {
        println("ARC")
    } else {
        println("ABC")
    }
}