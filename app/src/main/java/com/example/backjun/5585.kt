package com.example.backjun

fun main(){
    val max = 1000
    val money = readln().toInt()
    val payback = max - money

    println((payback/500)+(payback%500/100)+(payback%500%100/50)+(payback%500%100%50/10)+(payback%500%100%50%10/5)+(payback%500%100%50%10%5))

    /**  더 효율적인 코드
     * val coins = arrayOf(500, 100, 50, 10, 5, 1)
     *     var payback = 1000 - readln().toInt()
     *     var count = 0
     *
     *     for (coin in coins) {
     *         count += payback / coin
     *         payback %= coin
     *     }
     *     println(count)
     */
}