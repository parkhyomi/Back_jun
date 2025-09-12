package com.example.backjun

/**
 * 초기 행운 수치 0
 * 두 종류의 주문서 N,M /주문서를 적절한 순서로 전부 소모
 *
 */

fun main(){
    val (N,M) = readln().split(" ").map{it.toInt()}
    val Add = readln().split(" ").map{it.toInt()}.take(N)
    val multiply = readln().split(" ").map{it.toLong()}.take(M).toMutableList()

    for ( i in multiply.indices){
        if(multiply[i]== 0.toLong()){
            multiply[i] = 1
        }
    }

    val mul = multiply.reduce { acc, i -> acc * i }
    println(Add.sum()*mul)

}