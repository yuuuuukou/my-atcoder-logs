private fun readString() = readLine()!!
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
    solveABC260B()
}

fun solveABC260B() {
    val (n, x, y, z) = readInts()
    val a = readInts()
    val b = readInts()

    data class Student(val no: Int, val math: Int, val english: Int, val sum: Int = math + english)

    val list = mutableListOf<Student>()
    for (i in 0 until n) {
        list.add(Student(i + 1, a[i], b[i]))
    }

    var res = mutableListOf<Int>()

    // x人
    list.sortWith(compareBy({ -it.math }, { it.no }))
    for (i in 0 until x) {
        res.add(list[i].no)
    }

    // y人
    var cntY = 0
    list.sortWith(compareBy({ -it.english }, { it.no }))
    for (item in list) {
        if (cntY == y) break

        if (!res.contains(item.no)) {
            res.add(item.no)
            cntY++
        }
    }

    // z人
    var cntZ = 0
    list.sortWith(compareBy({ -it.sum }, { it.no }))
    for (item in list) {
        if (cntZ == z) break

        if (!res.contains(item.no)) {
            res.add(item.no)
            cntZ++
        }
    }

    res.sort()
    for (item in res) {
        println(item)
    }
}

fun solveABC260A() {
    val s = readString()
    if (s[0] != s[1] && s[0] != s[2]) {
        println(s[0].toString())
        return
    }
    if (s[1] != s[0] && s[1] != s[2]) {
        println(s[1].toString())
        return
    }
    if (s[2] != s[0] && s[2] != s[1]) {
        println(s[2].toString())
        return
    }
    println(-1)
}