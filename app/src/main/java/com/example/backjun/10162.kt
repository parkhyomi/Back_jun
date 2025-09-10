package com.example.backjun

/**
 * 전자레인지 ABC 5분 1분 10초
 * 냉동음식마다 전자레인지로 요리해야할 시간 T가 초단위
 */
fun main(){
    val T = readln().toInt()
    if(T%10==0){
        print("${T/300} ${(T%300)/60} ${(T%300)%60/10}")
    }else
    {
        print(-1)
    }
}
