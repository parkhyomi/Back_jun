package com.example.backjun

//fun main(){
//    val (N, M) = readln().split(" ").map{ it.toLong() }
//    val list = readln().split(" ").map { it.toLong() }.toMutableList()
//
//    val rounds = M / N
//    var remaining = M % N
//
//    for(i in list.indices){
//        list[i] -= rounds
//    }
//
//    for (i in list.indices) {
//        if (remaining == 0L) break
//        list[i] -= 1L
//        remaining --
//    }
//
//    if (list.any { it <= 0L }) {
//        print("OUT")
//    } else {
//        print("DIMI")
//    }
//}

fun main() {
    val (N, M) = readln().split(" ").map { it.toLong() }
    val A = readln().split(" ").map { it.toLong() }
    val base = M / N
    val rem = (M % N).toInt()
    for (i in 0 until N.toInt()) {
        val watched = base + if (i < rem) 1 else 0
        if (watched >= A[i]) {
            print("OUT")
            return
        }
    }
    print("DIMI")
}