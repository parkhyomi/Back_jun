package com.example.backjun

import java.util.Scanner

fun main() {
    while (true) {
        try {
            val (A, B, C) = readln().split(" ").map { it.toInt() }
            val result = maxOf(B - A, C - B) - 1
            println(result)

        } catch (e: Exception) {
            break
        }
    }
}