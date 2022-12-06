private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC155B()
}

fun solveABC155B() {
    val n = readInt()
    val a = readInts()

    var res = "APPROVED"
    for (ai in a) {
        if (ai % 2 == 0) {
            if (ai % 3 == 0 || ai % 5 == 0) {
                // ok
            } else {
                // ng
                res = "DENIED"
            }
        } else {
            // odd
        }
    }

    println(res)
}

fun solveABC155A() {
    val (a, b, c) = readInts()
    if (a == b && b != c || b == c && c != a || c == a && a != b) {
        println("Yes")
    } else {
        println("No")
    }
}