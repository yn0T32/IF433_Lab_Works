package oop_00000124960_AntonyChandra.week5

fun main(){
    val dosen1 = Dosen("pak Alex", "0123456");
    val admin1 = Admin("bu Siti");

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== Aktivitas Pegawai ===")
    for(pegawai in daftarPegawai){
        pegawai.bekerja();
        when(pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen(NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork();
            }
        }
        println("----------------------------")
    }
}