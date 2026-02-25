package oop_00000124960_AntonyChandra.week4

open class Makanan  {
    private var namaResto:String ="";
    open protected var harga:Int =0;
    open protected var stock:Int =10;

    init {
        namaResto = "Steak 12";
        println("Resto saua $namaResto");
    }

    open public fun jual_makanan() {
        println("Saya jual makanann");
    }
}