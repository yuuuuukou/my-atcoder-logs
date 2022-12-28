private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC182B()
}

fun solveABC182B() {
    val n = readInt()
    val a = readInts()

    val array = MutableList(1001) { 0 }
    for (i in 2..1000) {
        for (ai in a) {
            if (ai % i == 0) {
                array[i]++
            }
        }
    }

    println(array.indexOf(array.max()))
}

fun solveABC182A() {
    val (a, b) = readInts()
    val followMax = 2 * a + 100
    println(followMax - b)
}