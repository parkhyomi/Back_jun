package com.example.backjun

/**
 * 하루에 한 시간 일하면
 * 피로도는 A 만큼 쌓이고
 * 일은 B만큼 처리할 수 있다.
 * 한 시간을 쉰다면 피로도는 C만큼 줄어든다
 * M을 넘기면 일하는데 번아웃이 와서 이미 했던 일들도 다 던져버리고 일을 그만두게 된다.
 *
 * 24시간
 * 입력 A B C M
 * 1시간 마다
 * 예제 입력 1
 * 5 3 2 10
 * 예제 출력 1
 * 24
 * 예제 입력 2
 * 10 5 1 10
 * 예제 출력 2
 * 15
 * 예제 입력 3
 * 11 5 1 10
 * 예제 출력 3
 * 0
 *
 * 출력 얼마나 많은 일은 할수 있는지
 */

/** 내가 생각한 조건
 *  24번 반복
 *  무조건 A>M
 */
fun main(){
    val (A,B,C,M) = readln().split(" ").map{ it.toInt() }
    var Hour = 24
    var tired = 0
    var maxWork = 0
    if(A<=M){
        while(Hour>0) {
            if (tired + A <= M) {
                tired += A
                maxWork += B
                Hour -= 1
            } else { // else 의 중요성!
                tired -= C
                if (tired < 0) tired = 0
                Hour -= 1
            }
        }
        print(maxWork)
    }else{
        print(maxWork)
    }
}



