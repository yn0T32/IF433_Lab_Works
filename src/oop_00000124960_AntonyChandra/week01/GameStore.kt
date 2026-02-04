package oop_00000124960_AntonyChandra.week01

fun main () {
    val gameTitle = "Metal Gear Solid V: Phantom Pain"
    val price = 672000
    printReceipt(gameTitle, price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.8).toInt() else price

fun printReceipt(title: String, price: Int) {
    val finalPrice = calculateDiscount(price)
    println("Game: $title")
    println("Final Price: Rp$finalPrice")
}





