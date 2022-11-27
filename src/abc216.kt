private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC216B()
}

fun solveABC216B() {
    val n = readInt()

    data class Person(val firstName: String, val lastName: String) {
        fun isSameName(person: Person): Boolean {
            return (person.firstName == this.firstName
                    && person.lastName == this.lastName)
        }
    }
    val persons = mutableListOf<Person>()

    var res = "No"
    repeat(n) {
        val (si, ti) = readStrings()
        val currentPerson = Person(si, ti)
        for (person in persons) {
            if (person.isSameName(currentPerson)) {
                res = "Yes"
            }
        }
        persons.add(currentPerson)
    }

    println(res)
}

fun solveABC216A() {
    val xy = readString()

    if (xy.length == 4) {
        when (xy[3].toString().toInt()) {
            in 0..2 -> {
                println("${xy[0]}${xy[1]}-")
            }
            in 3..6 -> {
                println("${xy[0]}${xy[1]}")
            }
            in 7..9 -> {
                println("${xy[0]}${xy[1]}+")
            }
        }

    } else {
        when (xy[2].toString().toInt()) {
            in 0..2 -> {
                println("${xy[0]}-")
            }
            in 3..6 -> {
                println("${xy[0]}")
            }
            in 7..9 -> {
                println("${xy[0]}+")
            }
        }

    }
}