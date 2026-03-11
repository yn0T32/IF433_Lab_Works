package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

class Manager(name: String,baseSalary: Int ): Employee(name, baseSalary)
    {
    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
       super.calculateBonus()
        return baseSalary + 500000
    }
}