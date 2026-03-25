package oop_00000124960_AntonyChandra.week7

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama:String = "unknown";

        fun set_nilai(uts:Int, uas:Int): Int{
            return(uts+uas)/2;
        }
        fun isi_nama_kampus(namaUniv: String){
            Mahasiswa(namaUniv);
        }
    }
    init {
        println("nama kampus kamu $kampus")
    }
}