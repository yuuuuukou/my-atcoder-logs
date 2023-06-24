private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC079C()
}

fun solveABC079C() {
    val abcd = readLn()

    for (i in 0..1) {
        for (j in 0..1) {
            for (k in 0..1) {
                var exp = abcd.substring(0..0)
                var num = abcd.substring(0..0).toInt()

                if (i == 0) {
                    exp += "+"
                    exp += abcd.substring(1..1)
                    num += abcd.substring(1..1).toInt()
                } else {
                    exp += "-"
                    exp += abcd.substring(1..1)
                    num -= abcd.substring(1..1).toInt()
                }
                if (j == 0) {
                    exp += "+"
                    exp += abcd.substring(2..2)
                    num += abcd.substring(2..2).toInt()
                } else {
                    exp += "-"
                    exp += abcd.substring(2..2)
                    num -= abcd.substring(2..2).toInt()
                }
                if (k == 0) {
                    exp += "+"
                    exp += abcd.substring(3..3)
                    num += abcd.substring(3..3).toInt()
                } else {
                    exp += "-"
                    exp += abcd.substring(3..3)
                    num -= abcd.substring(3..3).toInt()
                }

                if (num == 7) {
                    exp += "=7"
                    println(exp)
                    return
                }
            }
        }
    }
}

fun solveABC079B() {
    val n = readInt()
    val l = mutableListOf<Long>()
    if (n == 0) {
        println(2)
        return
    }
    l.add(2)
    if (n == 1) {
        println(1)
        return
    }
    l.add(1)
    while (true) {
        l.add(l[l.lastIndex] + l[l.lastIndex - 1])
        if (l.lastIndex == n) {
            println(l[l.lastIndex])
            return
        }
    }
}

fun solveABC079A() {
    val n = readLn()
    if (n[0] == n[1] && n[1] == n[2] || n[1] == n[2] && n[2] == n[3]) {
        println("Yes")
    } else {
        println("No")
    }
}