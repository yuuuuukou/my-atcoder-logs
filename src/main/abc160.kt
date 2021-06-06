package main

fun main(args: Array<String>) {
    val (k, _) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var max = 0

    // 1個前の家との距離
    val list = mutableListOf<Int>()

    for (i in a.indices) {
        val distance =
                if (i == 0) {
                    // 初回は末尾要素との距離
                    (k - a.last()) + a[i]
                } else {
                    // 初回以降は手前要素との距離
                    a[i] - a[i - 1]
                }
        list.add(distance)

        max = if (max < distance) distance else max
    }

    // 一番コストかかる経路を端折る
    list.removeAt(list.indexOf(max))
    println(list.sum())
}