private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC206B()
}

fun solveABC206B() {
    val n = readInt()

    var day = 0
    var current = 0
    var amount = 0
    do {
        day++
        amount += (++current)
    } while (amount < n)

    println(day)
}

fun solveABC206A() {
    val n = readInt()
    val price = (n * 1.08).toInt()
    when {
        price < 206 -> {
            println("Yay!")
        }
        price == 206 -> {
            println("so-so")
        }
        else -> {
            println(":(")
        }
    }
}