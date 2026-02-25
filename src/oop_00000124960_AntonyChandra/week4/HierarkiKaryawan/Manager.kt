package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

class Manager: Employee("Boss Budi", 400){
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
       super.calculateBonus()
        return baseSalary + 500000
    }
}