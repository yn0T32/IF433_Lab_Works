package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

class Developer(
    name: String,
    baseSalary: Int,
    val ProgrammingLanguage: String=""
): Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $ProgrammingLanguage.")
        super.calculateBonus()
        println("Gaji Developer: ${calculateBonus()}")
    }
}