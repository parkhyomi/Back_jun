package com.example.backjun


/**
 * 고양이는 처음 0
 *
 * 생성마법 -> 1마리를 생성
 * 복제마법 -> 0마리 이상 k마리 이하 복제 가능 (k는 현재 존재하는 고양이 수)
 *
 * N마리의 고양이를 입력 받을 것
 * 복제 수는 딱 N 일 것 -
 *
 */

/**
 * 입력은 10의 12승 이므로 long
 * 한 번은 무조건 생성 마법을 생성 해야됨
 * 복제 수가 딱 N -> Min 으로 하면 되는건가?
 * 1)고양이가 32마리고 65마리에 맞추고 싶어 총 32마리 복제 할 수 있고 나중에 1마리 추가
 * 2)고양이가 29마리고 43마리에 맞추고 싶어 총 29마리 복제할 수 있고 14마리만 추가
 * -> if ((N - cat)>cat) {cat += cat} else cat+=N-cat
 */

fun main() {
    val N = readln().toLong()
    var cat = 0L
    var count = 0L

    if(N!=0L){
        cat += 1L
        count += 1L
    }

    while (cat!=N){
        if ((N - cat)>cat) {
            cat += cat
            count += 1L
        }
        else {
            cat += N - cat
            count += 1L
        }
    }
    print(count)
}