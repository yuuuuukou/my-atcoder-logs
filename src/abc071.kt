fun main(args: Array<String>) {
    solveABC071B()
}

fun solveABC071B() {
    val s = readLine()!!

    val alphabet = listOf(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    )
    val map = mutableMapOf<String, Int>()
    for (a in alphabet) {
        map[a] = 0
    }

    for (si in s) {
        map[si.toString()] = (map[si.toString()] ?: 0) + 1
    }

    var res = "None"
    for (a in alphabet) {
        if (map[a] == 0) {
            res = a
            break
        }
    }

    println(res)
}

