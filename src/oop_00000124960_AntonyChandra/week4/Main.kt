package oop_00000124960_AntonyChandra.week4

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.accelerate()
    myCar.openTrun()
    myCar.honk()
}