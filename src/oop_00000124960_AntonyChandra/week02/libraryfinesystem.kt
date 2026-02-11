package oop_00000124960_AntonyChandra.week02
import java.util.Scanner

class loan (var booktitle: String, var borrower: String, var loanDuration: Int){
    init {
        loanDuration = 1;
    }
    fun calculateFine(){
        if (loanDuration  >= 3){
            var totalDenda = loanDuration - 3 * 2000
        } else {
            var totalDenda = loanDuration - 3
        }
    }
    fun main(){
        val scanner = Scanner(System.`in`)
        println("Judul Buku: ")
        booktitle=scanner.nextLine()

        println("Masukkan nama Peminjam: ")
        borrower=scanner.nextLine()

        println("Pinjam berapa hari? (tidak boleh minus!)")
        loanDuration=scanner.nextInt()

    }
}