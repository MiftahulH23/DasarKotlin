package com.example.dasarkotlin

fun main() {
//    tipe data range

    val range = 1..10
    println(range)

//    Mendapatkan total data dirange

    println(range.count())
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

//    range terbalik

    var rangeTerbalik = 100 downTo 1
    println(rangeTerbalik)
    println(rangeTerbalik.step)

//    mengatur step
     var stepRange = 1..10 step 2
    println(stepRange)
    println(stepRange.count())
    println(stepRange.step)

}