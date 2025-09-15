package com.example.backjun

import kotlin.math.max

//7
//6 4 10 2 5 7 11  -> 3

/**
 * 모든 인텍스를 순환
 * 자신보다 큰 인덱스를 만나면 종료 및 변수 = (큰인덱스 - 자기 인댁스 -1)
 * 새로운 값이 변수보다 크다면 재 저장
 */
fun main() {
    val N = readln().toInt()
    val list = ArrayList<Int>(readln().split(" ").map{it.toInt()}).take(N)
    var count = 0
    for (i in list.indices){ // 0 1 2 ...
        for (p in i+1..(list.size-1)){ // i 부터 마지막 까지
            if(list[i]>list[p]){
                if(count<(p-i)) count=p-i
            }
            else {
                break
            }
        }
    }
    print(count)
}