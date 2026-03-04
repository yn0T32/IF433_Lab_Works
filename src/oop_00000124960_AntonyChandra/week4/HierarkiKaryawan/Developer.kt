package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

class Developer(
    name: String = "ynot",
    baseSalary: Int =30000,
    val ProgrammingLanguage: String=""
): Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $ProgrammingLanguage.")
        super.calculateBonus()
    }
}