package com.example.backjun

import kotlin.math.min

/**
 * 첫 줄에는 2개의 정수 N, M
 * 포인트 카드에 2N개의 칸 M장의 포인트 카드
 * 2개의 정수 A, B (0 ≤ Ai ≤ 2N, 0 ≤ Bi ≤ 2N, Ai + Bi = 2N)
 * M-1개 이상의 경품을 얻기 위해 필요한 비용의 최솟값을 엔 단위
 *
 * 입력
 * 4 5
 * 1 7
 * 6 2
 * 3 5
 * 4 4
 * 0 8
 * 출력 4
 *
 * 입력
 * 5 4
 * 5 5
 * 8 2
 * 3 7
 * 8 2
 * 출력 0
 */

/**
 * A+B =2N
 * 총 입력은 M 개 받아야 하며
 *
 * A는 >= N / count >= M-1 끝
 * 만약 count < M-1 N-A가 작은순으로 카운트 하고 yen 저장
 */
fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val NMList = ArrayList<ArrayList<Int>>()
    val minlist = ArrayList<Int>()
    var p = 0
    var count = 0
    var yen = 0

    repeat(M) {
        val exlist = ArrayList<Int>(readln().split(" ").map { it.toInt() }.take(2))
        if (exlist.sum() == 2 * N) {
            NMList.add(exlist)
        }
    }

    for (i in NMList.indices) {
        if (NMList[i][0] >= N) {
            count += 1
        } else {
            minlist.add(N - NMList[i][0])
            minlist.sort()
        }
    }
    while(count<M-1){
        yen += minlist[p]
        count += 1
        p += 1
    }
    print(yen)
}
/**
fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val minlist = mutableListOf<Int>()
    var successCount = 0

    repeat(M) {
        val (A, B) = readln().split(" ").map { it.toInt() }
        if (A >= N) {
            successCount += 1
        } else {
            minlist.add(N - A)
        }
    }

    val needCards = M - 1 - successCount

    if (needCards <= 0) {
        println(0)
        return
    }

    minlist.sort()
    println(minlist.take(needCards).sum())
}
*/