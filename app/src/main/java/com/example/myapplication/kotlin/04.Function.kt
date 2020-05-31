package com.example.myapplication.kotlin

// 04. Function

// fun 함수명 (변수명: 타입 ...) : 반환형 {
//      함수내용
//      return 반환값
// }

fun plus(first: Int, second: Int): Int {
    return first + second
}

// -디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    return first + second
}

// 간단하게 함수 만들기
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(args: Array<String>) {
    println(plus(2, 3))

    plusMany(1,2,3,4,5,6,7,8)
}