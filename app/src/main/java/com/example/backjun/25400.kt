package com.example.backjun


fun main(){
    val nMin = 1
    val nMax = 250000
    val N = readln().toInt()
    N.coerceIn(nMin,nMax)

    val list = ArrayList<Int>(readln().split(" ").map{it.toInt()}).take(N)
    var cut =0
    var find =1

    for (i in list){
        if(i == find){
            find+=1
        }else{
            cut+=1
        }
    }
    print(cut)
}