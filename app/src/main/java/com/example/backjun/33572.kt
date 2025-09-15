package com.example.backjun

fun main(){
    val (N, M) = readln().split(" ").map{ it.toLong() }
    val list = readln().split(" ").map { it.toLong() }.toMutableList()
    var sum = 0L

    for( i in list.indices ){
       sum += list[i]-1
        if(sum >= M) break
    }

    if (sum < M) {
        print("OUT")
    } else {
        print("DIMI")
    }
}