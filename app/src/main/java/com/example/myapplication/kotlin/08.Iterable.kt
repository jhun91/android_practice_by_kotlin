package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복 1
    for (item in a) {
        println(item)
    }

    //반복 2
    for ((index, item) in a.withIndex()) {
        println("index : $index item : $item")
    }

    //반복 3
    a.forEach {
        println(it)
    }

    //반복 4
    a.forEach { item ->
        println(item)
    }

    //반복 5
    a.forEachIndexed { index, item ->
        println("index ::: $index , item ::: $item")
    }

    //반복 6 - until ->  for (int i = 0; i < a.size; i++) -> until은 마지막을 포함하지 않는다.
    for (i in 0 until a.size) {
        println(a[i])
    }

    //반복 7  0부터 a.size -1까지 -> index를 2씩 증가
    for (i in 0 until a.size step (2)) {
        println(a[i])
    }
    println()

    //반복 8 -> index8부터 0까지 역순으로
    for (i in a.size - 1 downTo (0)) {
        println(a[i])
    }
    println()

    //반복 9 -> downTo 스텝 지정
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a[i])
    }

    //반복 10 -> ..은 마지막을 포함한다. (until은 마지막 포함하지 않는다)
    for (i in 0..10) {
        println(i)
    }

    //반복 11 -while
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++
        println("b")
    }

    var d: Int = 0
    var e: Int = 4
    //반복 12 - dowhile
    do {
        println("Hellooooo")
        d++
    } while (d < e)

}