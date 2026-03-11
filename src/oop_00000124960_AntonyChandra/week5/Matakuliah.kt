package oop_00000124960_AntonyChandra.week5

abstract class Matakuliah {
    var nama: String = "";

    abstract fun set_matkul(sks: Int)

    fun hasil_matkul(){
        println("Matkul diminati");
    }
}