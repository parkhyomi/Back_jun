package com.example.backjun


fun main() {
    val n = readln().toInt()

    val towers = readln().split(" ").map { it.toInt() }.take(n)

    var result = 1 // 첫 첨탑은 무조건 밀어야함

    for (i in 0 until n - 1) {
        if (towers[i] <= towers[i + 1]) {
            result++
        }
    }
    println(result)
}