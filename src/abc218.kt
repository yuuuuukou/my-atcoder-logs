private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC218B()
}

fun solveABC218B() {
    val p = readInts()
    for (pi in p) {
        print(
            when (pi) {
                1 -> "a"
                2 -> "b"
                3 -> "c"
                4 -> "d"
                5 -> "e"
                6 -> "f"
                7 -> "g"
                8 -> "h"
                9 -> "i"
                10 -> "j"
                11 -> "k"
                12 -> "l"
                13 -> "m"
                14 -> "n"
                15 -> "o"
                16 -> "p"
                17 -> "q"
                18 -> "r"
                19 -> "s"
                20 -> "t"
                21 -> "u"
                22 -> "v"
                23 -> "w"
                24 -> "x"
                25 -> "y"
                26 -> "z"
                else -> ""
            }
        )
    }
}

fun solveABC218A() {
    val n = readInt()
    val s = readString()
    if (s[n - 1].toString() == "o") {
        println("Yes")
    } else {
        println("No")
    }
}