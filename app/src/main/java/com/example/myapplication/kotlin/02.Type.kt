package com.example.myapplication.kotlin

// 02. 자료형
/*
    정수형 -> Long > Int > Short > Byte
    실수형 -> Double > Float
    문자 -> Char
    문자열 -> String
    논리형 -> Boolean  (True / False)
 */

//변수선언(1)
// 스마트 캐스트
var number = 10

//변수선언(2)
var number1: Int = 20
var hello1: String = "Hello World"
var point1: Double = 1.3

// Variable or Value
// 1. 변하지 않는 값 - val
// 2. 변할 수도 있고 아닐수도 있고 잘 모르겠다 - val -> var 로 변경하는 방법을 사용

fun main(args: Array<String>) {
    number = 20
    //number = 20.5
}
