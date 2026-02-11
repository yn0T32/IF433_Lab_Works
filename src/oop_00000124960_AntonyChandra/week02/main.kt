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
    else print("Masukkan Jurusan: ")

    val s1 = Student(name, nim, major, gpa = 0.0)
}