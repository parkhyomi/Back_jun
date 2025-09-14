package com.example.backjun

import kotlin.math.min

//3
//SSS ->3

//4
//SLLS ->4

//9
//SLLLLSSLL ->7
//10
//LLSLLSSSLL -> 8
/**
 * s 3개 -> 3개 홀더 4개
 * L 2개 s 2개 ->4개 홀더 4개
 * s 3개 L 6개 ->7개 홀더 7개
 * s 4개 L 6개 ->8개 홀더 8개
 *
 * 홀더의 개수는 S+1+ L/2 or LL
 *
 * 컵 홀더의 개수를 세기 / 사람수 세기 min 으로 출력
 *
 */
fun main(){
    val N = readln().toInt()
    val pepol = readln().take(N)

    val sConut = pepol.count{ it == 'S' }
    val LConut = pepol.count{ it == 'L' }

    val holder = sConut+1+(LConut/2)

    print(min(holder,pepol.length))
}