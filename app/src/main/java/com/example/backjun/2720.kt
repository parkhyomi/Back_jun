package com.example.backjun

fun main(){
    var T = readln().toInt()
    val c_list = ArrayList<Int>()

    while(0<T) {
        val c  = readln().toInt()
        c_list.add(c)
        T --
    }
    for (p in c_list.indices){ // 배열의 크기만큼 인덱스 잡기
        println("${c_list[p]/25} ${(c_list[p]%25)/10} ${((c_list[p]%25)%10)/5} ${((c_list[p]%25)%10)%5}")
    }

    /** 이상적인 코드
    val inputs = List(readln().toInt()) { readln().toInt() }

    val results = inputs.map { c ->
        val q25 = c / 25
        val q10 = (c % 25) / 10
        val q5  = ((c % 25) % 10) / 5
        val q1  = ((c % 25) % 10) % 5
        "$q25 $q10 $q5 $q1"
    }

    println(results.joinToString("\n"))
    */
}
