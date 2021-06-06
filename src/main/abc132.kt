package main

fun main(args: Array<String>) {
    /*val n = */readLine()!!.toInt()
    val dList = readLine()!!.split(" ").map { it.toInt() }.sorted()

    val dx = dList[dList.size / 2 - 1]
    val dy = dList[dList.size / 2]

    println(dy - dx)
}