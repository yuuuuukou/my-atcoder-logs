package main

fun main(args: Array<String>) {
    val s = readLine()!!

    var result = ""
    for (i in s.indices) {
        var tmpStr = ""

        for (j in i until s.length) {
            val current = s[j].toString()
            if (current == "A" || current == "C" || current == "G" || current == "T") {
                tmpStr += current
            } else {
                break
            }
        }

        if (tmpStr.length > result.length) {
            result = tmpStr
        }
    }

    println(result.length)
}