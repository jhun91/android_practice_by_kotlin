package com.example.myapplication.kotlin

// 10. Class

// OOP -> Object Oriented Programming 객체지향 프로그래밍
fun main() {
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    val bigCar: Car = Car("v8 engine", "big")
}

//클래스 만드는 방법1
class Car(var engine: String, var body: String) {

}