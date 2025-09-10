package com.example.backjun

import java.util.Scanner

fun main(){
    val count = readln().toInt()
    var sum =0
    val listA = ArrayList<Int>(readln().split(" ").map{it.toInt()}).take(count)
    val listB = ArrayList<Int>(readln().split(" ").map{it.toInt()}).take(count)
    if(listA.sum()==listB.sum()){
        for(i in listA.indices) {
            if (listA[i] > listB[i]) {
                sum += listA[i] - listB[i]
            }
        }
        println(sum)
    }
}