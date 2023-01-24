private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC066B()
}

fun solveABC066B() {
    val s = readLn()

    var res = 0
    for (i in 1 until s.lastIndex step 2) {
        val s1 = s.substring(0..i / 2)
        val s2 = s.substring(i / 2 + 1..i)
        if (s1 == s2) {
            res = s1.length * 2
        }
    }

    println(res)
}

fun solveABC066A() {
    val abc = readInts().sorted()
    println(abc[0] + abc[1])
}