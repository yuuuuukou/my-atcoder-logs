private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC116A()
}

fun solveABC116B() {
    val s = readLine()!!.toInt()

    val a = mutableMapOf<Int, Int>()
    var before = s
    for (i in 1..1000000) {
        if (i == 1) {
            a[s] = i
            continue
        }

        val f =
            if (before % 2 == 0) {
                before / 2
            } else {
                (3 * before) + 1
            }

        if (a.containsKey(f)) {
            println(i)
            break
        } else {
            a[f] = i
        }
        before = f
    }

}

fun solveABC116A() {
    val (ab, bc, _) = readInts()
    println(ab * bc / 2)
}