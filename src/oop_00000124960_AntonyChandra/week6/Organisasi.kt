package oop_00000124960_AntonyChandra.week6

interface Organisasi {
    val namaOrg: String;
    val budgetRapat: Int;
    val jmlOrg: Int;
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg;
    fun rapat();
    fun keaktifan(){
        println("ih kamu aktif")
    }
}