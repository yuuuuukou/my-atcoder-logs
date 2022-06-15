fun main(args: Array<String>) {
    solveABC082B()
}

fun solveABC082B() {
    val s = readLine()!!.toList().sorted()
    val t = readLine()!!.toList().sortedDescending()

    val list = mutableListOf<String>()

    var sSorted = ""
    for (si in s) {
        sSorted += si
    }
    list.add(sSorted)

    var tSorted = ""
    for (ti in t) {
        tSorted += ti
    }
    list.add(tSorted)

    if (list[0] == list[1]) {
        println("No")
    } else {
        if (list.sorted()[0] == list[0]) {
            println("Yes")
        } else {
            println("No")
        }
    }
}
