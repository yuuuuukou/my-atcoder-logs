private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC214A()
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