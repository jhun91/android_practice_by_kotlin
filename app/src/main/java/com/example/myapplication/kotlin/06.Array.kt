package com.example.myapplication.kotlin

// 배열

fun main(args: Array<String>) {
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    group1[0]

    //기본형 배열 선언할땐 아래 방법을 사용하자.
    var arr1 = intArrayOf(1, 2, 3)
    var arr2 = charArrayOf('1', '2', '3')
    var arr3 = doubleArrayOf(3.1, 4.3, 6.1)

    // Array 생성 다른 방법  lambda로
    // 쉼표가 아니고 세미콜론으로 구분한다.
    var arr4 = Array(10, { 0 })
    var arr5 = Array(5, { 1;2;3;4;5 })


}