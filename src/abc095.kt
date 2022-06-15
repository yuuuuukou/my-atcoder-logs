fun main(args: Array<String>) {
    solveABC095A()
}

fun solveABC095A() {
    val s = readLine()!!

    var cost = 700

    for (i in s.indices) {
        if (s[i].toString() == "o") {
            cost += 100
        }
    }

    println(cost)
}
