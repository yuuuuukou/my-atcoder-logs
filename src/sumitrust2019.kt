fun main() {
    solveSumitrust2019D()
}

fun solveSumitrust2019D() {
    /*val n = */readLine()!!.toInt()
    val s = readLine()!!

    var cnt = 0
    for (i in 0..999) {
        val iString = when (i.toString().length) {
            1 -> "00$i"
            2 -> "0$i"
            else -> "$i"
        }

        var foundFirst = false
        var foundSecond = false
        var foundThird = false
        for (si in s) {
            if (!foundFirst && si.toString() == iString[0].toString()) {
                foundFirst = true
            } else if (foundFirst && !foundSecond && si.toString() == iString[1].toString()) {
                foundSecond = true
            } else if (foundFirst && foundSecond && !foundThird && si.toString() == iString[2].toString()) {
                foundThird = true
            }
        }
        if (foundThird) {
            cnt++
        }
    }

    println(cnt)
}
