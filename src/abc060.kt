private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC060B()
}

fun solveABC060B() {
    val (a, b, c) = readInts()

    if (a == 1) {
        println("YES")
        return
    }

    var sum = 0
    while (sum < 100000) {
        sum += a
        if (sum % b == c) {
            println("YES")
            return
        }
    }

    println("NO")
}

fun solveABC060A() {
    val (a, b, c) = readStrings()

    if (a[a.lastIndex] == b[0] && b[b.lastIndex] == c[0]) {
        println("YES")
    } else {
        println("NO")
    }
}