package com.example.backjun

fun main() {
    val korea = arrayOf('K', 'O', 'R', 'E', 'A')
    val input = readln().toList()
    var count = 0
    var num = 0

    for (i in input) {
        while (i == korea[num%5]) {
            count += 1
            num+=1
            break
        }
    }
    print(count)
}