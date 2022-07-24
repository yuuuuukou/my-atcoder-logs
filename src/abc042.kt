fun main(args: Array<String>) {
    solveABC042B()
}

fun solveABC042B() {
    val (n, /* l */_) = readLine()!!.split(" ").map { it.toInt() }

    val list = mutableListOf<String>()
    for (i in 0 until n) {
        list.add(readLine()!!)
    }
    list.sort()
    println(list.joinToString(""))
}