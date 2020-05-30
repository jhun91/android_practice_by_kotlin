package com.example.myapplication.kotlin

// 04. Function

// fun 함수명 (변수명: 타입 ...) : 반환형 {
//      함수내용
//      return 반환값
// }

fun plus(first: Int, second: Int): Int {
    return first + second
}

fun main(args: Array<String>) {
    println(plus(2, 3))
}