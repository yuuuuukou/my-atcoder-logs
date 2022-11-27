private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC214B()
}

fun solveABC214B() {
    val (s, t) = readInts()

    var cnt = 0
    for (ai in 0..100) {
        for (bi in 0..100) {
            for (ci in 0..100) {
                if (ai + bi + ci <= s && ai * bi * ci <= t) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}

fun solveABC214A() {
    when (readInt()) {
        in 1..125 -> {
            println(4)
        }
        in 126..211 -> {
            println(6)
        }
        in 212..214 -> {
            println(8)
        }
    }
}