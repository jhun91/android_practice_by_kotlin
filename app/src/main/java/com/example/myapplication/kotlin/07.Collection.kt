package com.example.myapplication.kotlin

// 07. Collection
//

fun main(args: Array<String>) {

    // List  -> 중복 허용
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)

    // Set -> 중복 허용하지 않음
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
}