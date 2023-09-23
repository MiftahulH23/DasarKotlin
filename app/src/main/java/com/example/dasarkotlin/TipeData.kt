package com.example.dasarkotlin

fun main() {
//    Tipe data number
    var bilanganBulat = 20
    var bilanganDesimal = 20.5

//    Konversi tipe data
    var konversiDesimal = bilanganBulat.toDouble()
    var konversiBulat = bilanganDesimal.toInt()

    println(konversiDesimal)
    println(konversiBulat)

//    Tipe data literal
    var hexadesimal: Int =0xFFFFF
    var binaryLiteral: Int =0b101001

//    Tipe data char
    var char: Char ='A'

//    Tipe data string 1 baris
    var name: String ="raul"

//    Tipe data string 2 baris
    var address: String = """
        Jl. Tegal Sari No 2,
        Umban sari,
        Rumbai, 
        Pekanbaru,
        Riau
    """.trimIndent()

//    Menggabungkan string
    var biodata: String = "$name $address"
    var biodata1: String = name + " " + address
    var desc: String = "$name jumlah huruf= ${name.length}"
}