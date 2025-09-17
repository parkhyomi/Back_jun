package com.example.backjun

/**
 * 물건의 총 개수 n
 * 사과는 A로, 파인애플은 P로, 펜은 p로 대소문자를 구분
 *
 * pPAp
 */

/**
 * pPAp가 나온다면 i+4 부터 시작 / 없다면 i+1
 * 1초 안에 내장 함수 되도록이면 안쓰게
 * 배열에 pPAp 저장
 * while index != realindex -> if(list[i..i+3] == array[i..i+3] ) index+3  count+= 1 else index=1 count+=1
 */
fun main(){
    val N = readln().toInt()
    val list = readln().toList().take(N)
    val answarelist = listOf('p','P','A','p')
    var index = 0
    var count = 0

    while ( index < list.size-1 ) {
        if (list[index]==answarelist[0] && list[index+1]==answarelist[1]&& list[index+2]==answarelist[2]&& list[index+3]==answarelist[3]) {
            // if (list.subList(i, i+4) == answarelist) 이런식으로 작성하면 더 효율적으로 작성할 수 있음
            index += 4
            count += 1
        }
        else {
            index += 1
        }
    }
    print(count)
}

/**
 * 내장 함수를 사용한다면 이런식으로도 가능 함
 *     val N = readln().toInt()
 *     val list = readln().toList().take(N)
 *     val answarelist = listOf('p','P','A','p')
 *
 *     val count = list.windowed(4, 1).count { it == answarelist }
 *     print(count)
 */