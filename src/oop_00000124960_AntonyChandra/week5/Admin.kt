package oop_00000124960_AntonyChandra.week5

class Admin(nama: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }
    fun doAdminWork(){
        println("[$nama] sedang merkap data absensi mahasiswa");
    }
}