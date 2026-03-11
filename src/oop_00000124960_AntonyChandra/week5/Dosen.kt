package oop_00000124960_AntonyChandra.week5

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan mervisi rpkps");
    }
    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}