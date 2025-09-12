package com.example.backjun

import androidx.collection.ArrayMap

/**
 * 입력
 * 첫째줄 N(강의실 개수), M(요청 개수)
 * 강의실의 번호 k와 이용 시작 시각과 끝 시각 s,e
 *
 * s가 임박한 순으로 주어지고, 이용 시작 시각이 같은 예약은 없다.
 * 예약 시스템은 예약 요청을 순서대로 확인하는데,
 * 단, 이용 끝 시각과 이용 시작 시각이 같은 두 예약은 겹친 것이 아니다.
 *

 * N번 순차진행
    * (k==n)
    *  k번 처음 yes -> K번의 e와 다음 K번의 s와 동일한 것을 찾아 yes
 *

 *
 * 출력
 * 허용한다면 Yes, 아니면 No
 */

fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val lastEndTime = mutableMapOf<Int, Int>()
    val result = mutableListOf<String>()

    repeat(M) {
        val (room, start, end) = readln().split(" ").map { it.toInt() }

        if (lastEndTime.getOrDefault(room, 0) <= start) { // 번호별 마지막 시간 저장 기본 0 start보다 작거나 같다면
            lastEndTime[room] = end // 룸번호로 마지막 시간 업데이트
            result.add("YES") // 예약 가능 결과 리스트에 삽입
        } else {
            result.add("NO") // 예약 불가능 결과 리스트에 삽입
        }
    }

    for (i in result.indices){
        println(result[i]) // 결과 출력
    }
}

//2 4
//1 1 4
//2 2 5
//1 3 7
//1 5 8