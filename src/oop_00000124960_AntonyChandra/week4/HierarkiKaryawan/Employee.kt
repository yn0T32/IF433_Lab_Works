package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

open class Employee(val name: String, val baseSalary: Int) {

    open fun work(){
        println("$name sedang bekerja.")
    }
    open fun calculateBonus(): Int{

        return baseSalary / 10

    }

}