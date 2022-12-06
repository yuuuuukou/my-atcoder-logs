private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC165B()
}

fun solveABC165B() {
    val x = readLong()

    var year = 0
    var account = 100L

    while (account < x) {
        year++
        // account = (account * 1.01).toInt()
        account += account / 100
    }

    println(year)
}

fun solveABC165A() {
    val k = readInt()
    val (a, b) = readInts()

    var ok = false
    for (i in a..b) {
        if (i % k == 0) {
            ok = true
            break
        }
    }

    println(if (ok) "OK" else "NG")
}