package com.example.backjun

fun main() {
    val N = readln().toInt()
    val list = ArrayList<Int>()

    repeat((N)/2){
        list.add(1)
        list.add(2)
    }
    if(N%2!=0){list.add(3)}

    for(i in list){
        print("${i} ")
    }
}