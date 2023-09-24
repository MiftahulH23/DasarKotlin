package com.example.dasarkotlin

fun main() {

//    operasi pembagian
    var result = 10/2
    println(result)
    var desimal: Double = 10.0/3.0
    println(desimal)

//    saintific
    var test = 1+4/2
    println(test)

//    augmented assignments
    var total: Int = 0
    var barang1 = 100
    var barang2 = 50
    total += barang1
    println(total)
    total -= barang2
    println(total)

//    unary operator
    println("menaikan value dari total 1")
    total++
    println(total)

//    bilangan negatif
    var suhu = -5

//    boolean kebalikan
    var sehat = true
    println(!sehat)

}