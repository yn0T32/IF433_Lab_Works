package oop_00000124960_AntonyChandra.week6

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMatkul: String,
    override val nilaiMk: Int
): Organisasi, kelasMK {
    override fun rapat() {
        println("sedang rapat di $namaOrg\nBiaya Konsumsi: ${super.biayaKonsumsi}");
    }

    override fun keaktifan() {
        super<Organisasi>.keaktifan()
        super<kelasMK>.keaktifan()
    }

    override fun penilaian() {
        println("Nilai $namaMatkul: $nilaiMk");
    }
}