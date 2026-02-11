package oop_00000124960_AntonyChandra.week02

class Student (
    val name: String,
    val nim: String,
    var major: String
){
    init {
        if(nim.length != 5){
            println("WARNING: Objek tercipta dengan ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek Student $name berhasil di alokasikan di memory.")
        }
    }
}