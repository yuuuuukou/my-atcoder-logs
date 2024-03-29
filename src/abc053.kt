fun main(args: Array<String>) {
    solveABC053B()
}

fun solveABC053B() {
    val s = readLine()!!

    var startIndex = 0
    var isStartChecked = false
    var endIndex = 0
    for (i in s.indices) {
        if (s[i].toString() == "A" && !isStartChecked) {
            isStartChecked = true
            startIndex = i
        }

        if (s[i].toString() == "Z") {
            endIndex = i
        }
    }

    println(endIndex - startIndex + 1)
}

fun solveABC053A() {
    val (x) = readLine()!!.split(" ").map { it.toInt() }

    if (x < 1200) {
        println("ABC")
    } else {
        println("ARC")
    }
}