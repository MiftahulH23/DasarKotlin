package com.example.dasarkotlin

fun main() {
//    Array di kotlin hanya bisa menampun 1 tipe data
    var members: Array<String> = arrayOf("raul", "huda")
    var values: Array<Int> = arrayOf(2,4)
    var height: Array<Double> = arrayOf(2.5, 5.3)

//    Pemanggilan data array
    var memberPertama = members[0]

    println("Member Pertama adalah $memberPertama")

//    Merubah isi data array
    members.set(0, "Miftahul")
    println()
    println("Data setelah di ubah")
    println(members[0])

//    Array nullable
    var nilai: Array<Int?> = arrayOfNulls(10)
}