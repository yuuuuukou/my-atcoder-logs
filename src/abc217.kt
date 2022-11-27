private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC217B()
}

fun solveABC217B() {
    val s1 = readString()
    val s2 = readString()
    val s3 = readString()

    if ("ABC" !in arrayOf(s1, s2, s3)) {
        println("ABC")
    } else if ("ARC" !in arrayOf(s1, s2, s3)) {
        println("ARC")
    } else if ("AGC" !in arrayOf(s1, s2, s3)) {
        println("AGC")
    } else if ("AHC" !in arrayOf(s1, s2, s3)) {
        println("AHC")
    }
}

fun solveABC217A() {
    val (s, t) = readStrings()
    if (s < t) {
        println("Yes")
    } else {
        println("No")
    }
}