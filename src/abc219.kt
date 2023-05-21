private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC219C()
}

fun solveABC219C() {
    val x = readString()
    val n = readInt()

    class Name(val name: String, var sortName: String)

    val s = mutableListOf<Name>()
    repeat(n) {
        val si = readString()
        s.add(Name(si, si))
    }

    for (si in s) {
        for ((i, xi) in x.withIndex()) {
            val tmp = when (i) {
                0 -> "A"
                1 -> "B"
                2 -> "C"
                3 -> "D"
                4 -> "E"
                5 -> "F"
                6 -> "G"
                7 -> "H"
                8 -> "I"
                9 -> "J"
                10 -> "K"
                11 -> "L"
                12 -> "M"
                13 -> "N"
                14 -> "O"
                15 -> "P"
                16 -> "Q"
                17 -> "R"
                18 -> "S"
                19 -> "T"
                20 -> "U"
                21 -> "V"
                22 -> "W"
                23 -> "X"
                24 -> "Y"
                25 -> "Z"
                else -> ""
            }
            si.sortName = si.sortName.replace(xi.toString(), tmp)
        }
    }

    s.sortWith(compareBy { it.sortName })

    for (si in s) {
        println(si.name)
    }
}

fun solveABC219B() {
    val s1 = readString()
    val s2 = readString()
    val s3 = readString()
    val t = readString()

    val res = StringBuilder()
    for (ti in t) {
        when (ti.toString()) {
            "1" -> res.append(s1)
            "2" -> res.append(s2)
            "3" -> res.append(s3)
        }
    }

    println(res)
}

fun solveABC219A() {
    val x = readInt()
    when (x) {
        in 0 until 40 -> {
            println(40 - x)
        }
        in 40 until 70 -> {
            println(70 - x)
        }
        in 70 until 90 -> {
            println(90 - x)
        }
        in 90..100 -> {
            println("expert")
        }
    }
}