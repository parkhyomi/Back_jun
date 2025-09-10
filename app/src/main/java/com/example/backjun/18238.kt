package com.example.backjun

import kotlin.math.abs
import kotlin.math.min // 이것도 적어줘야함

/**
 * ZOAC
 *
 * ACOZ
 * 0 min(0.0)+ 0 min(2,24) + start2 min(12,14) + start14 min(11,15)
 */
fun main() {
    //A -> K 정방향 10 역방향 16 index A = 0 K = 10  역 k = 16 / 1 11 17
    //K -> R 정방향 7 역방향 19 index K = 10 R = 17  역 R = 9 / 11 18 10
    val English = listOf('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
//    val reverseEnglish = English.reversed()

    var startindex = English.indexOf('A')

    var time = 0

    val input = readln().toList()
//    println(input.sorted())

    for(i in input){
        val index = English.indexOf(i)
        println("index ${index}")
//        val reversIndex = (reverseEnglish.indexOf(i))
//        println("reversIndex ${reversIndex}\n")
        time += min(abs(index-startindex),26-abs(index-startindex))
        println("reversIndex ${index-startindex},${26-abs(index-startindex)}\n") //26이 포인트
        startindex = English.indexOf(i)
    }
    println("time${time}")
}
