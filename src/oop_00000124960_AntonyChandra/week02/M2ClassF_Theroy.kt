package oop_00000124960_AntonyChandra.week02

class Pemain {
    var nama= "tidak terdaftar"
    var speed= 9
    val shoot= 8

    init {
        nama="Halland"
        println("ini adalah constructor")
    }

    constructor(alias: String="Hal", kecepatan: Int=5) {
        nama=alias
        speed=kecepatan
        println("ini konstruktror kedua")
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola");
    }
}

fun main() {
    val player = Pemain("Surti",20)
    println("his name is : ${player.nama}")
    println("his speed is : ${player.speed}")
    player.bawa_bola()
}