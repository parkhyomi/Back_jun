package com.example.backjun

/**
 * 공격 카드는 N/ 상대 체력은 H
 * 체력이 0 이하면 죽음
 * 사용 카드의 공격력이 오름차순으로 주어질 때 최대 몇 개의 카드를 사용
 * 모든 카드를 사용헤도 죽일수 없다면 -1
 * 4 5
 *
 */
fun main() {
    val (N, H) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    var sum =0

    for (i in 0..N-1) {
        sum += list[i]
        if(sum>=H) {
            print(i+1)
            return // 함수를 종료 시켜주는것이 중요함
        }
    }
    println(-1)
}