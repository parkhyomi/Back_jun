package com.example.backjun

/**
 * 입력 1 마을 수
 * 입력 2 마을 이동비용
 *
 * 5
 * 1 6 5 2 4 -> 12
 *
 * 4
 * 100 100 100 101 ->300
 */
fun main(){
    val village = readln().toInt()
    val villageMoney = ArrayList<Int>(readln().split(" ").map{ it.toInt() }.take(village))
    var expensive = 0
    for (i in villageMoney){
        if(i>expensive){
            expensive = i
        }
    }
    villageMoney.remove(expensive)
    print(villageMoney.sum())
}