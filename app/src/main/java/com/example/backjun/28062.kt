package com.example.backjun

/**
 * 5
 * 2 3 8 9 7
 */
fun main() {
    val bundle = readln().toInt()
    val list = ArrayList<Int>(readln().split(" ").map { it.toInt() }.take(bundle))
    val sum = list.sum()
    val min = ArrayList<Int>()

    for (i in list) {
        if (i % 2 != 0) {
            min.add(i)
        }
    }

    min.sort()
    if (sum % 2 != 0) {
        print(sum - min[0])
    } else {
        print(sum)
    }
}

/**
fun main() {
    val bundle = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }.take(bundle)
    val sum = list.sum()
    val oddMin = list.filter { it % 2 != 0 }.minOrNull()

    if (sum % 2 != 0 && oddMin != null) {
        println(sum - oddMin)
    } else if (sum % 2 == 0) {
        println(sum)
    } else {
        println(0)
    }
}
*/