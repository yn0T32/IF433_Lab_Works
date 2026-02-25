package oop_00000124960_AntonyChandra.week4

class ElectricCar: Car("Hyunde", 4, 100){
    final override fun accelerate() {
        println("$brand, berkaselerasi dalam sunyi. kapasitas batterai $batteryCapacity")
    }
}