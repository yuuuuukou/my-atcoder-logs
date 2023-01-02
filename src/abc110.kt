private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC110B()
}

fun solveABC110B() {
    val (n, m, x, y) = readInts()
    val xs = readInts()
    val ys = readInts()

    for (z in -100..100) {
        if (z in (x + 1)..y
            && xs.max()!! < z
            && ys.min()!! >= z) {
            println("No War")
            return
        }
    }

    println("War")
}

fun solveABC110A() {
    val abc = readInts()
    abc.sortDescending()
    println(abc[0] * 10 + abc[1] + abc[2])
}