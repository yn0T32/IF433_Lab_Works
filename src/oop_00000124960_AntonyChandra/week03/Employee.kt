package oop_00000124960_AntonyChandra.week03

class Employee(name:String) {
    var salary: Int = 0
    set(value) {
        if (value < 0){
            println("ERROR: Gaji tidak boleh negatif! di-set ke 0.")
            field = 0
        } else {
            field = value
        }
    }
    var name: String = "ayam"
    val tax: Double
        get()=salary * 0.1;
    private var performanceRating: Int = 3

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }
//
    fun printStatus(){
        println("Karyawan: $name, rating: $performanceRating")
    }
}