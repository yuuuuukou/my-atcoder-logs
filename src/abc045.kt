private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC045B()
}

fun solveABC045B() {
    var sa = readString()
    var sb = readString()
    var sc = readString()

    var next = 'a'
    while (true) {
        var target = ""
        when (next) {
            'a' -> target = sa
            'b' -> target = sb
            'c' -> target = sc
        }
        if (target.isEmpty()) {
            when (next) {
                'a' -> println("A")
                'b' -> println("B")
                'c' -> println("C")
            }
            return
        } else {
            val current = next
            next = target[0]
            when (current) {
                'a' -> sa = sa.substring(1..sa.lastIndex)
                'b' -> sb = sb.substring(1..sb.lastIndex)
                'c' -> sc = sc.substring(1..sc.lastIndex)
            }
        }
    }
}

fun solveABC045A() {
    val a = readInt()
    val b = readInt()
    val h = readInt()

    println((a + b) * h / 2)
}
