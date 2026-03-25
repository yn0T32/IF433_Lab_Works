package oop_00000124960_AntonyChandra.week7

fun main(){
    Koneksi.test_koneksi()
    println("Server: ${Koneksi.linkServer}")

    Mahasiswa.nama="Udin";
    val na = Mahasiswa.set_nilai(80, 77)
    println("Nilai ${Mahasiswa.nama}: $na")

    Mahasiswa.isi_nama_kampus("UMN")
    val dsn1 = Dosen("Indah", "12345134", 2020 )
    println(dsn1)
    val dsn2 = dsn1.copy("Budi", "321232")
    println(dsn2)

    println("Nama dosen: ${dsn1.nama}\nMasuk tahun: ${dsn1.tahunMasuk}")
    //---Call ENum Class---
    println("Matkul fav saya " + MataKuliah.OOP.name);
    println("Index Matkul: "+ MataKuliah.OOP.ordinal);
    MataKuliah.OOP.matkul_sks();

    for (matkul in MataKuliah.entries){
        print ("matkul: "+ matkul + " ")
        matkul.matkul_sks()
    }
}