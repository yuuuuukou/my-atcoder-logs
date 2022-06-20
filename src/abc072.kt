fun main(args: Array<String>) {
    solveABC072B()
}

fun solveABC072B() {
    val s = readLine()!!

    var result = ""
    for (i in s.indices) {
        val no = i + 1
        if (no % 2 == 0) {
            continue
        } else {
            result += s[i]
        }
    }

    println(result)
}

