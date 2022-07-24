fun main(args: Array<String>) {
    solveABC067B()
}

fun solveABC067B() {
    val (/*n*/ _, k) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    l.sortDescending()

    var res = 0
    var i = 0
    while (i < k) {
        res += l[i]
        i++
    }

    println(res)
}