package oop_00000124960_AntonyChandra.week03

open class Bapake {
    private var nama: String = "blum ada nama";
    private var umur: Int = 20;
    protected var gaji: Int= 1000;

    public var uangJajan:Int = 0
        set(value){
            if (value < 0){
                println("Masa ga ada uang jajan :(")
            } else {
                field = value
            }
        }
        get(){
            return field + 123
        }


    public fun set_nama(namabaru: String){
        if (this.nama.length <= 0){
            println("Nama tidak boleh kosong")
        } else
            this.nama = namabaru
    }
    public fun get_nama(): String{
        return this.nama
    }

    public fun set_umur(umurbaru: Int){
        if (this.umur <= -5){
            println("umur tidak boleh kurang dari -5")
        } else{
            this.umur = umurbaru
        }
    }
    public fun get_umur(): Int{
        return this.umur
    }
}

class Anake: Bapake(){
    fun dapatin_gaji():Int {
        return this.gaji + 100;
    }
}

fun main(){
    var bpk = Bapake();
    bpk.set_umur(20)
    var anak = Anake();
    anak.uangJajan = 100
    anak.set_nama("Yanto");
    println("nama ayah kamu ${anak.get_nama()}");
    println("umur ${bpk.get_umur()}");
    println("Gaji ${anak.dapatin_gaji()}");
    println("Uang jajan kamu ${anak.uangJajan}")
}