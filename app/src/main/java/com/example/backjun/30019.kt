package com.example.backjun

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

fun main(){
    val (N, M) = readln().split(" ").map{it.toInt()}
    val listM = ArrayList<ArrayList<Int>>()
    val result = arrayListOf("YES")
//    var s = 0
    var e = listM[0][2] // 첫번재 끝나느 시간

    repeat(M){
        val KSEList = ArrayList<Int>(readln().split(" ").map{it.toInt()}.take(3))
        listM.add(KSEList)
    }
    println("list${listM}")
//    for (i in 1..N){ // 방번호
//        println("방 ${i}")
//        for(p in listM.indices){ //0,1,2
//            result.add("YES")
//            if(i==listM[p][0]){ // 방번호와 예약 방번호가 같은 리스트들만 뽑겠다
//                println("p${listM[p]}")
//                var e = listM[p][2] // 현재 예약건의 끝나는 시간
//                println(e)
//                if(e<=listM[p+1][1] || ) {
//                    result.add("YES") // 예약 끝나는 시간이 다음 번호의 시작시간과 같거나 작다면 YES
//                }
//            }
//        }
//    }
    for(i in 1..(listM.size)-2){
        println(i)
        if(listM[i][0]==listM[i+1][0]){ // 첫번재 방과 두번째 방이 같아
            if(e<=listM[i+1][1]) { // 앞끝나는 시간이 뒤 시작 시간보다 작아
                result.add("YES")
            }
        }
    }
}