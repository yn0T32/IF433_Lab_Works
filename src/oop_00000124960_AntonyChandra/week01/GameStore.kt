package oop_00000124960_AntonyChandra.week01

fun main() {
    val gameTitle = "Metal Gear Solid V: Phantom Pain"
    val price = 672000
    val userNote: String? = null
    printReceipt(gameTitle, price, userNote)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.8).toInt() else price

fun printReceipt(title: String, price: Int, userNote: String?) {
    val finalPrice = calculateDiscount(price)
    val note = userNote ?: "Tidak ada catatan"

    println("Game Title : $title")
    println("Final Price: Rp$finalPrice")
    println("Catatan    : $note")
}






