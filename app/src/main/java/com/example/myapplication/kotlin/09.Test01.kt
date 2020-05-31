package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    first()
    println(second(80))
    third(52)
    gugudan()
}

fun first() {
    var numList = MutableList(9, { 0 })
    var booleanList = MutableList(9, { true })

    for (i in 0..8) {
        numList[i] = i+1
    }
    println(numList)

    numList.forEachIndexed { index, value ->
        booleanList[index] = value % 2 == 0
    }
    println(booleanList)
}

fun second(score: Int): String {
    when(score) {
        in 90..100 -> {
            return "A"
        }
        in 80..89 -> {
            return "B"
        }
        in 70..79 -> {
            return  "C"
        }
        else -> {
            return "F"
        }
    }
}

fun third(number: Int) {
    val strNum: String = number.toString()
    var leftNum: Int = strNum.substring(0, 1).toInt()
    var rightNum: Int = strNum.substring(1, 2).toInt()

    println(leftNum + rightNum)
}

fun gugudan() {
    for (i in 2..9) {
        for (j in 1..9) {
            println("$i * $j = ${i * j}")
        }
    }
}