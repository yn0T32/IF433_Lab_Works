package oop_00000124960_AntonyChandra.week5

class Elective: Matakuliah(){
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming";
        println("Elective: ${super.nama}\nSksnya: $sks");
    }
    fun ada_praktek(){
        println("Wajib di praktekin");
    }
}