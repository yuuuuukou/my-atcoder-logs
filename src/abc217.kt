private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC217C()
}

fun solveABC217C() {
    val n = readInt()
    val p = readInts()

    val q = MutableList(1000000) { 0 }

    // i 1 2 3
    // p 2 3 1
    // q 3 1 2
    // 全てのiに対して、qのpi番目の要素がi
    // i=1 qのp1(=2)番目の要素がi(=1)
    // i=2 qのp2(=3)番目の要素がi(=2)
    // i=3 qのp3(=1)番目の要素がi(=3)
    for (i in 1..n) {
        q[p[i - 1]] = i
    }

    for (i in 1..n) {
        print("${q[i]} ")
    }
    println()
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