package oop_00000124960_AntonyChandra.week4.HierarkiKaryawan

fun main (){
    var emp = Employee("",0)
    var mene = Manager("Boss Budi", 300000)
    var Dev = Developer("Ynot", 30000, "C#")
    emp.work()
    emp.calculateBonus()
    Dev.work()
    Dev.calculateBonus()
}