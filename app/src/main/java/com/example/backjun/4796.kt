package com.example.backjun

import kotlin.math.min

fun main(){
    val list = ArrayList<List<Int>>()

    while (true) {
        val trip = readln().split(" ").map { it.toInt() }.take(3).toList()
        list.add(trip)
        if (trip.sum()==0)break
    }

    val size = list.size
    for(i in 0..size-2) {
        val max = list[i][2]/list[i][1]
        val add = list[i][2]%list[i][1]

        val count = list[i][0] * max + min(add,list[i][0])
        println("Case ${i+1}: ${count}")
    }
}