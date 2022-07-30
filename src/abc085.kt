fun main(args: Array<String>) {
    solveABC085B()
}

fun solveABC085B() {
    val n = readLine()!!.toInt()
    val d = mutableMapOf<Int,Int>()
    for (i in 0 until n){
        val di = readLine()!!.toInt()
        d[di] = 1
    }
    println(d.size)
}

fun solveABC085A() {
    val s = readLine()!!

    println(s.replace("2017", "2018"))
}
