package com.example.backjun

fun main(){ // 힌트를 받음
    val sto = readln().toInt()

    val milk = ArrayList<Int>(readln().split(" ").map{ it.toInt() }.take(sto))
    var count = 0
    var order = 0

    for(i in milk) {
        if(i==(order%3)){ // 이번 문제의 포인트
            order += 1
            count += 1
        }
    }
    print(count)
}