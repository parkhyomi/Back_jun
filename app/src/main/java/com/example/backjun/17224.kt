package com.example.backjun

import kotlin.math.min

/**
 * 전체로 돌고
 * 순서대로
 * a,b 가 둘 다 L 보다 작거나 같으면 b 140
 * 둘중에 하나가 크면 작은걸로 -> a 100 b 140
 * 둘 다 크면 그냥 rek + 1
 * 숫자 카운트
 */

fun main() {
    val nMin = 1
    val nMax = 100

    val (N, L, K) = readln().split(" ").map{it.toInt()}
    val alist = ArrayList<ArrayList<Int>>()

    N.coerceIn(nMin,nMax)
    L.coerceIn(nMin,nMax/2)

    repeat(N){
        val problem = ArrayList<Int>(readln().split(" ").map { it.toInt() })
        alist.add(problem)
    }

    var hard = 0
    var easy = 0
    for (i in alist) {
        if (i[1] <= L) {
            hard += 1
        } else if (i[0] <= L && i[1] > L) {
            easy += 1
        }
    }

    val hardfix = min(hard,K)
    val easyfix = min(easy,K-hardfix)

    print((140*hardfix)+(100*easyfix))
}