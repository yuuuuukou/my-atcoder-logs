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
    solveABC304C()
}

fun solveABC304C() {
    val (n, d) = readInts()

    class Person(val x: Int, val y: Int)

    val persons = mutableMapOf<Int, Person>()
    for (i in 0 until n) {
        val (xi, yi) = readInts()
        persons[i] = Person(xi, yi)
    }

    val virus = MutableList(n) { 0 }
    virus[0] = 1
    val nextCheck = mutableSetOf<Int>()
    nextCheck.add(0)
    val checked = mutableSetOf<Int>()
    while (nextCheck.isNotEmpty()) {
        val tmp = nextCheck.toMutableList()
        for (checkPerson in tmp) {
            for (i in 0 until n) {
                val person = persons[i]
                if (checked.contains(i)) continue

                val a1 = persons[checkPerson]!!.x
                val a2 = persons[checkPerson]!!.y
                val b1 = person!!.x
                val b2 = person!!.y
                if (d * d >= (a1 - b1) * (a1 - b1) + (a2 - b2) * (a2 - b2)) {
                    virus[i] = 1
                    nextCheck.add(i)
                }
            }
            nextCheck.remove(checkPerson)
            checked.add(checkPerson)
        }
    }

    for (i in 0 until n) {
        if (virus[i] == 1) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun solveABC304B() {
    val n = readString()

    if (n.length <= 3) {
        println(n)
        return
    }

    val tmp1 = n.substring(0..2)
    var tmp2 = ""
    repeat(n.length - 3) {
        tmp2 += "0"
    }
    println("${tmp1}${tmp2}")
}

fun solveABC304A() {
    val n = readInt()

    var min = Int.MAX_VALUE
    val s = mutableListOf<String>()
    val a = mutableListOf<Int>()
    repeat(n) {
        val (si, ai) = readStrings()
        s.add(si)
        a.add(ai.toInt())

        min = kotlin.math.min(min, ai.toInt())
    }

    var print = false
    for (i in 0 until n) {
        if (a[i] == min) print = true

        if (print) {
            println(s[i])
        }
    }
    for (i in 0 until n) {
        if (a[i] == min) return

        println(s[i])
    }
}