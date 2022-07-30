fun main(args: Array<String>) {
    solveABC081C()
}

fun solveABC081C() {
    val (_, k) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    // 種類ごとの数を数える
    val map = mutableMapOf<Int, Int>()
    for (ai in a) {
        map[ai] = (map[ai] ?: 0) + 1
    }

    // 種類ごとの数をリストにつっこんでソート
    val list = mutableListOf<Int>()
    for (item in map) {
        list.add(item.value)
    }
    val listAsc = list.sorted()

    // リストの末尾k要素までをカウント
    var res = 0
    for ((i, item) in listAsc.withIndex()) {
        if (i >= listAsc.size - k) {
            // 末尾k要素はそのままで良いので数えない
        } else {
            res += item
        }
    }

    println(res)
}

fun solveABC081B() {
    /*val n = */readLine()!!
    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var cnt = 0
    var canContinue = true
    while (canContinue) {
        for (i in a.indices) {
            if (a[i] % 2 != 0) {
                canContinue = false
            } else {
                a[i] /= 2
            }
        }
        cnt++
    }

    // 最後1回余計に数えているのでデクリメント
    cnt--

    println(cnt)
}

fun solveABC081A() {
    val s = readLine()!!

    println(s[0].toString().toInt() + s[1].toString().toInt() + s[2].toString().toInt())
}
