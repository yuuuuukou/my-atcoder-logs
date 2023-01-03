private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC109B()
}

fun solveABC109B() {
    val n = readInt()
    val map = mutableMapOf<String, String>()
    var before: String? = null
    for (i in 0 until n) {
        val wi = readLn()
        if (before == null) {

        } else {
            if (wi[0] == before[before.lastIndex]) {
                if (map.containsKey(wi)) {
                    // ng
                    println("No")
                    return
                } else {
                    // ok
                }
            } else {
                // ng
                println("No")
                return
            }
        }

        before = wi
        map[wi] = ""
    }

    println("Yes")
}

fun solveABC109A() {
    val (a, b) = readInts()
    if ((a * b * 1) % 2 == 1 || (a * b * 2) % 2 == 1 || (a * b * 3) % 2 == 1) {
        println("Yes")
    } else {
        println("No")
    }
}