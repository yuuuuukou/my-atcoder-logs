private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC067A()
}

fun solveABC067B() {
    val (/*n*/ _, k) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    l.sortDescending()

    var res = 0
    var i = 0
    while (i < k) {
        res += l[i]
        i++
    }

    println(res)
}

fun solveABC067A() {
    val (a, b) = readInts()
    if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
        println("Possible")
    } else {
        println("Impossible")
    }
}
