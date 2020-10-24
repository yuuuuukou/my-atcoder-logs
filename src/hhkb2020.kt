fun main() {
    solveA()
}

fun solveA() {
    val s = readLine()
    val t = readLine()

    if (s == "Y") {
        if (t == "a") {
            println("A")
        }
        if (t == "b") {
            println("B")
        }
        if (t == "c") {
            println("C")
        }
    }
    else {
        println(t)
    }
}
