package com.example.dasarkotlin
/* Variabel constant > wajib val
Biasanya constant menggunakan UPPARE CASE, dan biasanya berada di luar function main */

    const val MATERI = "Dasar Kotlin"

fun main() {
//    Pemanggilan variabel const
    println("$MATERI")

//    mutable atau dapat diubah
    var nama: String = "Raul"
    nama = "Miftahul"
    println(nama)

//    immutable atau tidak dapat di ubah
    val umur: Int = 25

//    Penulisan variabel tanpa tipe data
    var fullname = "Miftahul Huda"
    var codeHex = 0xFFFFF
    println(codeHex)

//    Nullable / variabel tanpa value
    var berat: Int?
    berat = 25
    println(umur)



}