package oop_00000124960_AntonyChandra.week5

class Wajib: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP";
        println("Nama Matkul: ${super.nama}\nSksnya: $sks");
    }

    fun ada_seminar(){
        println("Wajib ada seminar");
    }

}