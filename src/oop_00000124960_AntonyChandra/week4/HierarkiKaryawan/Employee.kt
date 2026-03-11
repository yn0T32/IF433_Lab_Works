package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

open class Employee(name1: String, baseSalary1: Int) {
   val name: String = ""
    val baseSalary: Int = 0;

    open fun work(){
        println("$name sedang bekerja.")
    }
    open fun calculateBonus(): Int{

        return (baseSalary / 10) + baseSalary
        println("Salary $baseSalary")

    }

}