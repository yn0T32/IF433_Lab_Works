package oop_00000124960_AntonyChandra.week02
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama:")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter):")
    val nim = scanner.next()

    if (nim.length!= 5)
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 Karakter!")
    else print("Pilih Jalur (1. Reguler 2. Umum): ")
    val type= scanner.nextInt()
    scanner.nextLine()
    if (type == 1){
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major, 0.0)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2){
        val s2 = Student(name, nim, 0.0)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Asal aja, pendaftaran dibatalkan!")
    }


}