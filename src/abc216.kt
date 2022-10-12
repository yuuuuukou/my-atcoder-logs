private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC216A()
}

fun solveABC216A() {
    val xy = readString()

    if (xy.length == 4) {
        when (xy[3].toString().toInt()) {
            in 0..2 -> {
                println("${xy[0]}${xy[1]}-")
            }
            in 3..6 -> {
                println("${xy[0]}${xy[1]}")
            }
            in 7..9 -> {
                println("${xy[0]}${xy[1]}+")
            }
        }

    } else {
        when (xy[2].toString().toInt()) {
            in 0..2 -> {
                println("${xy[0]}-")
            }
            in 3..6 -> {
                println("${xy[0]}")
            }
            in 7..9 -> {
                println("${xy[0]}+")
            }
        }

    }
}