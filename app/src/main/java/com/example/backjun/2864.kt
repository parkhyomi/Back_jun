package com.example.backjun

fun main() {
    val (a, b) = readln().split(" ").map{ it.toInt() }
    val amin = a.toString().replace("6", "5")
    val bmin = b.toString().replace("6","5")
    val amax = a.toString().replace("5","6")
    val bmax = b.toString().replace("5","6")
    val min = amin.toInt() + bmin.toInt()
    val max = amax.toInt() + bmax.toInt()
    print("${min} ${max}")

    /**
    val (a, b) = readln().split(" ").map { it.toInt() }

    val minSum = replaceDigit(a, '6', '5') + replaceDigit(b, '6', '5')
    val maxSum = replaceDigit(a, '5', '6') + replaceDigit(b, '5', '6')

    println("$minSum $maxSum")
    */
}

/**
    fun replaceDigit(num: Int, fromChar: Char, toChar: Char): Int {
        return num.toString().replace(fromChar, toChar).toInt()
    }
 */
