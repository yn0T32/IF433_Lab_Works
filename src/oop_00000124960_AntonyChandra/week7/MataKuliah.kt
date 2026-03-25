package oop_00000124960_AntonyChandra.week7

enum class MataKuliah (val jmlSks: Int) {
    OOP(3),
    GAMEDEV(2),
    DASPRO(4);
    fun matkul_sks(){
        println("Jml sksnya: $jmlSks")
    }
}